 class Solution {
    public List<List<Integer>> XXX(int numRows) {
        List<List<Integer>> nums = new ArrayList<>();
        ArrayList currentRow1 = new ArrayList();
        currentRow1.add(1);
        nums.add(currentRow1);
        for(int i = 1; i < numRows; i++) {
            ArrayList currentRow = new ArrayList();
            nums.add(currentRow);
            int preLen = i - 1>=0 ? nums.get(i - 1).size() : 0;
            for(int j = 0; j <= i; j++) {
                int left = 0, right = 0;
                if (j - 1 >= 0 && i - 1>=0) {
                    left = nums.get(i - 1).get(j - 1);
                }
                if (j < preLen && i - 1>=0) {
                    right = nums.get(i - 1).get(j);
                }
                currentRow.add(left + right);
            }
        }
        return nums;
    }
}

