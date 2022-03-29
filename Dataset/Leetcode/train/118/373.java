 class Solution {
    public List<List<Integer>> XXX(int numRows) {
        List<List<Integer>> res = new ArrayList<>();
        if(numRows == 0) return res;
        List<Integer> pre = new ArrayList<>(Arrays.asList(1));
        res.add(pre);
        if(numRows == 1) return res;
        for(int i = 2;i<=numRows;i++){
            List<Integer> curr = new ArrayList<>();
            //刚好第i行有i个元素
            for(int j = 0;j<i;j++){
                int value = (j == 0?0:pre.get(j-1)) + (j == i-1?0:pre.get(j));
                curr.add(value);
            }
            res.add(curr);
            pre = curr;//粗心呀！！
        }
        return res;
    }
}

