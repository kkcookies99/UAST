 class Solution {

    public static void main(String[] args) {
        List<String> result = new Solution().XXX(3);
        System.out.println("result = " +  result);
    }
    public List<String> XXX(int n) {
        List<String> resultList = new ArrayList<>();
        generate(resultList, "",0, 0, n);
        return resultList;
    }
    public void generate(List<String> resultList, String subString, int leftNum, int rightNum, int totalNum) {
        // 递归结束条件
        if (leftNum == totalNum && rightNum == totalNum) {
            resultList.add(subString);
            return;
        }
        // 如果左括号个数小于总数，则本次可以添加左括号，并继续递归
        if (leftNum < totalNum) {
            generate(resultList, subString + "(", leftNum + 1, rightNum, totalNum);
        }
        // 如果右括号小于总数，且右括号个数小于左括号，则本次可以添加右括号，并继续递归
        if (rightNum < totalNum && leftNum > rightNum) {
            generate(resultList, subString + ")", leftNum, rightNum + 1, totalNum);
        }
    }
}
