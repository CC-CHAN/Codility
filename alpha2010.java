import java.util.*;

class Solution {
	public int solution(int[] A) {
		Set<Integer> mySet = new HashSet<>();
		int flag = 0;
		for (int i = 0; i < A.length; i++) {
			if (!mySet.contains(A[i])) {
				mySet.add(A[i]);
				flag = i;
			}
		}
		return flag;
	}
}
