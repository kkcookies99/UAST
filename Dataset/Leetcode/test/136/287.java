 class Solution {
    public int singleNumber(int[] nums) {
        	HashMap<Integer, Boolean> hm = new HashMap<Integer, Boolean>();
		for (int i : nums) {
			if (!hm.containsKey(i)) {
				hm.put(i, true);
			} else {
				hm.put(i, false);
			}
		}
		for (Map.Entry<Integer, Boolean> k : hm.entrySet()) {
			if (k.getValue() == true) {
				return k.getKey();
			}
		}
		return -1;
    }
}

