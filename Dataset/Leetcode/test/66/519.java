class Solution {
    public int[] XXX(int[] digits) {
        StringBuilder sb = new StringBuilder();
        int len = digits.length;
        int i = len-1; // 尾部索引
        int carry = 1;
        while(i != -1){
            carry += digits[i];
            digits[i] = carry % 10;
            carry = carry / 10;
            i--;
        }
        if(carry==0) return digits;
        else{
            int[] res = new int[len+1];
            System.arraycopy(digits, 0, res, 1, len);
            res[0] = 1;
            return res;
        }
    }
}

