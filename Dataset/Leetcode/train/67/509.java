class Solution {
    public String XXX(String a, String b) {
        int[] num = new int[Math.max(a.length(), b.length()) + 1];
        char[] charsA = a.toCharArray(), charsB = b.toCharArray();
        int i = charsA.length - 1, j = charsB.length - 1, carry = 0, idx = num.length - 1;
        while (i >= 0 || j >= 0 || carry > 0) {
            int sum = 0;
            if (i >= 0 && j >= 0) {
                sum = charsA[i--] - '0' + charsB[j--] - '0' + carry;
            } else if (i >= 0){
                sum = charsA[i--] - '0' + carry;
            } else if (j >= 0){
                sum = charsB[j--] - '0' + carry;
            } else {
                sum = carry;
            }
            carry = sum / 2;
            num[idx--] = sum % 2;
        }
        StringBuilder res = new StringBuilder();
        while (++idx < num.length) {
            res.append((char)(num[idx] + '0'));
        }
        return res.toString();
    }
}

