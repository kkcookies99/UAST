 class Solution {
    public List<List<Integer>> XXX(int numRows) {
        List<List<Integer>> res = new ArrayList<>();
        for (int i=0;i<numRows;i++) {
            List<Integer> list = new ArrayList<>();
            if (i == 0) {
                list.add(1);
            }else {
                List<Integer> temp = res.get(i - 1);
                for (int j=0;j<=i;j++) {
                    int left = j-1 < 0 ? 0 : temp.get(j-1);
                    int right = j >= temp.size() ? 0 : temp.get(j);
                    list.add(left+right);
                }
            }
            res.add(list);
        }
        return res;
    }
}

