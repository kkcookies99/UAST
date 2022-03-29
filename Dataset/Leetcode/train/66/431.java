class Solution {
    public int[] XXX(int[] digits) {
        int carry = 0;
        int len = digits.length;
        if (digits[len - 1] + 1 >= 10) {
            carry = 1;
            digits[len - 1] = 0;
            for (int i = len - 2; i > -1; i--) {
                if (digits[i] + carry >= 10) {
                    carry = 1;
                    digits[i] = 0;
                } else {
                    digits[i] += carry;
                    carry = 0;
                    break;
                }
            }
        } else {
            digits[len - 1] += 1;
        }
        if (carry > 0) {
            int[] ans = new int[len+1];
            ans[0] = 1;
            System.arraycopy(digits,0,ans,1,len);
            return ans;
        }
        return digits;
    }
}

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


