 class Solution {
    public List<List<Integer>> XXX(int numRows) {
        List<List<Integer>> result = new ArrayList<>();
        for(int i = 0 ; i < numRows ; i++) { // i指示第i行，j指示当前行中的第j个元素
            List<Integer> rowNum = new ArrayList<>();
            for(int j = 0; j <= i; j++) {
                if(j == 0 || j == i) { // 每行首尾都是1
                    rowNum.add(1);
                } else {
                    // 第i-1行的第j-1个元素和第j个元素之和
                    rowNum.add(result.get(i - 1).get(j - 1) + result.get(i - 1).get(j)); 
                }
            }
            result.add(rowNum);
        }
        return result;
    }
}

