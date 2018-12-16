import java.util.*;

class Solution {
    
    private class obj {
		long a, b;

		public obj(long x, long y) {
			a = x;
			b = y;
		}

		public boolean isIntersect(obj o) {
			return !(o.a > this.b || o.b < this.a);
		}
	}
	
    public int solution(int[] A) {
        		Map<Integer, Integer> myMap = new HashMap<>();
		List<obj> myList = new ArrayList<>();
		
		int counter = 0;
		
		for (int i = 0; i < A.length; i++) {
			long x = 0, y = 0;
			obj o = new obj((long)i - A[i], (long)i + A[i]);
			for(obj item: myList) {
				if(o.isIntersect(item)) {
					counter++;
				}
			}
			myList.add(o);
		}
		return counter;
    }
}
