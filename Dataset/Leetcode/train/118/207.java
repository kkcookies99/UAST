 class Solution {
    public List<List<Integer>> XXX(int numRows) {
        return dynamicProgramming(numRows);
    }

    private List<List<Integer>> dynamicProgramming(int numRows) {
        List<List<Integer>> dp = new ArrayList<>();
        dp.add(Arrays.asList(1));
        for (int i = 1; i < numRows; i++) {         //遍历层
            //获取到上一层，根据上一层计算当前层的结果，而上一层的内容在到当前循环时已经计算过了，直接获取
            List<Integer> prevLevel = dp.get(i - 1);
            List<Integer> currentLevel = new ArrayList<>();
            currentLevel.add(1);                    //当前层的第一列为1
            for (int j = 1; j < i; j++) {          //遍历该层的列
                int val = prevLevel.get(j - 1) + prevLevel.get(j);
                currentLevel.add(val);
            }
            currentLevel.add(1);                    //当前层的最后一列为1
            dp.add(currentLevel);
        }
        return dp;
    }
}

