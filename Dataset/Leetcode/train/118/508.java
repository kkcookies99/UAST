 class Solution {
    public List<List<Integer>> XXX(int numRows) {
        // 1. 第i行有i个数
        // 2. 第i行第0,i-1个为1
        // 3. a[i][j] = a[i-1][j-1]+a[i-1][j]

        List<List<Integer>> res = new ArrayList<List<Integer>>();
        for (int i = 1; i <= numRows; i++) {
            List<Integer> list = new ArrayList<Integer>();
            // j其实从0开始到i-1
            list.add(1);
            int j = 1;
            for (; j < i - 1; j++) {
                list.add(res.get(i - 2).get(j - 1) + res.get(i - 2).get(j));
            }
            if (j < i) {
                list.add(1);
            }
            res.add(list);

        }
        return res;
    }
}

