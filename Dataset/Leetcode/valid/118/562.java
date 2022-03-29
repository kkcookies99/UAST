 class Solution {
    public List<List<Integer>> XXX(int numRows) {
        int[][] helper = new int[numRows][numRows];
        List<List<Integer>> ans = new ArrayList<>();
        for (int i = 0; i < numRows; i++) {
            List<Integer> list = new ArrayList<>();
            for (int j = 0; j <= i; j++) {
                if (j == 0 || j == i) {
                    helper[i][j] = 1;
                } else {
                    helper[i][j] = helper[i - 1][j - 1] + helper[i - 1][j];
                }
                list.add(helper[i][j]);
            }
            ans.add(list);
        }
        return ans;
    }
}

