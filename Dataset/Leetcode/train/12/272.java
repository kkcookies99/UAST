 class Solution {
    public String XXX(int num) {
        if (num < 1) {
            return "";
        }
        // nM nD nc nL nX nV nI
        int[] array1 = {1000, 500, 100, 50, 10, 5, 1};
        String[] symbolArray = {"M", "D", "C", "L", "X", "V", "I"};
        int[] nums = new int[array1.length];

        int last = num;
        for (int i = 0; i < array1.length;  i ++) {
            nums[i] = last / array1[i];
            last = last%array1[i];
        }
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < nums.length;  i ++) {
            for (int j = 0; j < nums[i]; j ++) {
                result.append(symbolArray[i]);
            }
        }
        return result.toString().replace("DCCCC", "CM").replace("LXXXX", "XC").replace("VIIII", "IX")
                .replace("CCCC", "CD").replace("XXXX", "XL").replace("IIII", "IV");
    }
}

