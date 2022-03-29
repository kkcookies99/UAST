 class Solution {
    public List<List<Integer>> XXX(int numRows) {
        int[][] yanghui = new int[numRows][numRows];
        ArrayList<List<Integer>> lists = new ArrayList<>();
        ArrayList<Integer> integers = new ArrayList<>();
        for (int i = 0 ; i < yanghui.length ;i++){
            integers = new ArrayList<Integer>();
            for (int j = 0; j <= i ; j++){
                yanghui[i][0] = 1;
                yanghui[i][i] = 1;
                if (i > 1 && j > 0){
                    yanghui[i][j] = yanghui[i -1][j - 1] + yanghui[i -1][j];
                }
                integers.add(yanghui[i][j]);
            }
            lists.add(integers);
        }
        return lists;


    }
}

