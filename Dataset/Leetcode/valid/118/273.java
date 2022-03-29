 class Solution {
    public List<List<Integer>> XXX(int numRows) {
        int[][] nums = new int[numRows][numRows];
        List<List<Integer>> lists = new ArrayList<>();
        for (int i = 0; i < numRows; i++) {
            List<Integer> list = new ArrayList<>();
            for (int j = 0; j <= i; j++) {
                nums[i][j] = j == 0 || j == i ? 1 : nums[i - 1][j - 1] + nums[i - 1][j];
                list.add(nums[i][j]);
            }
            lists.add(list);
        }
        return lists;
    }
}

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


