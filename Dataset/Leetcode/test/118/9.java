 class Solution {
    public List<List<Integer>> XXX(int numRows) {
        List<List<Integer>> yanghui = new ArrayList<List<Integer>>(numRows);
        for (int i = 0; i < numRows; i++) {
            List<Integer> inner = new ArrayList<Integer>(i + 1);
            inner.add(0, 1);
            for (int j = 1; j < i; j++) {
                inner.add(j, yanghui.get(i - 1).get(j) + yanghui.get(i - 1).get(j - 1));
            }
            if (i != 0) inner.add(1);
            yanghui.add(i, inner);
        }
        return yanghui;
    }
}

