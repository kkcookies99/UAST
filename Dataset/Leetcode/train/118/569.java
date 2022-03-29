 class Solution {
    public List<List<Integer>> XXX(int numRows) {
        List<List<Integer>> res = new ArrayList<>();
        int[][] f = new int[numRows][numRows];
        for (int i = 0; i < numRows; ++i) {
            List<Integer> list = new ArrayList<>();
            for (int j = 0; j <= i; ++j) {
                if (j == 0 || j == i) {
                    f[i][j] = 1;                                //填充左右边界
                } else if (i >= 2) {
                    f[i][j] = f[i - 1][j - 1] + f[i - 1][j];    //填充中间
                }
                list.add(f[i][j]);
            }
            res.add(list);
        }
        return res;
    }
}

