class Solution {
    public int[] XXX(int[] digits) {
        int add = 1;
        int len = digits.length;
        for(int i = len - 1;i >= 0;i -- ) {
            int count = digits[i] + add;
            if(count == 10) {
                if(i == 0) {
                    int[] tmp = new int[len + 1];
                    tmp[0] = 1;
                    digits = tmp;
                    break;
                }
                digits[i] = 0;
            }else{
                digits[i] += 1;
                break;
            }
        }
        return digits;
    }
}

