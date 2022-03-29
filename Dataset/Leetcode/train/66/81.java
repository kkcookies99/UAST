 class Solution {
    public int[] XXX(int[] digits) {

        Stack<Integer> stack = new Stack<>();
        boolean flag = false;
        digits[digits.length -1] += 1;
        for (int i = digits.length-1; i >= 0; i--) {
            if (digits[i] < 10) {
                return digits;
            } else {
                digits[i] = 0;
                if (i != 0) {
                    digits[i-1] += 1;
                } 

            }
        }
        int[] res = new int[digits.length + 1];
        res[0] = 1;
        System.arraycopy(digits, 0,res, 1, digits.length);
        return res;
    }
}


