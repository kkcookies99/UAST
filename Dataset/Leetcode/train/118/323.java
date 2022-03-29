 class Solution {
    public List<List<Integer>> XXX(int numRows) {
        //动态规划，每行的数字都可以从上一行的值得出。
        //定义二维数组dp[][];
        List<List<Integer>> dp = new ArrayList<>();
        for(int i =0;i<numRows;i++){
            List<Integer> child = new ArrayList<>();
            for(int j = 0;j<=i;j++){
                if(j==0||j==i){
                    child.add(1);
                }else{
                    //状态转换方程
                    child.add(dp.get(i-1).get(j-1)+dp.get(i-1).get(j));
                }
            }
            dp.add(child);
        }
        return dp;
    }
}

