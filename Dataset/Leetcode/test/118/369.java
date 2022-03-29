 class Solution {
    public List<List<Integer>> XXX(int numRows) {
        List<List<Integer>> list = new ArrayList<List<Integer>>();
		for (int i = 0; i < numRows; i++) {
			List<Integer> numList = new ArrayList<Integer>();
			for (int j = 0; j <= i; j++) {
				if (j == 0 || j == i) {
					numList.add(1);
				}else {
					numList.add(list.get(i - 1).get(j - 1) + list.get(i - 1).get(j));
				}
			}
			list.add(numList);
		}
		return list;
    }
}

