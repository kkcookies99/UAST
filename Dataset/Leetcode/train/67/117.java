 class Solution {
    public String XXX(String a, String b) {
        int lenA = a.length();
        int lenB = b.length();
        int minLen = Math.min(lenA, lenB);
        int carry = 0;
        StringBuffer results = new StringBuffer();
        for (int i = 0 ; i < minLen ; i++) {
            int aNum = a.charAt(lenA - i - 1) - '0';
            int bNum = b.charAt(lenB - i - 1) - '0';
            int sum = aNum + bNum + carry;
            if (sum == 3) {
                carry = 1;
                results.append(1);
            }
            else if (sum == 2) {
                results.append(0);
                carry = 1;
            }
            else {
                carry = 0;
                results.append(sum);
            }
        }
        if (lenA > lenB) {
            for (int i = lenA - minLen - 1 ; i >= 0 ; i--) {
                int num = a.charAt(i) - '0';
                int sum = num + carry;
                if (sum == 2) {
                    carry = 1;
                    results.append(0);
                }
                else {
                    carry = 0;
                    results.append(sum);
                }
            }
        }
        else if (lenA < lenB) {
            for (int i = lenB - minLen - 1 ; i >= 0 ; i--) {
                int num = b.charAt(i) - '0';
                int sum = num + carry;
                if (sum == 2) {
                    carry = 1;
                    results.append(0);
                }
                else {
                    carry = 0;
                    results.append(sum);
                }
            }
        }
        if (carry == 1) {
            results.append(1);
        }
        return results.reverse().toString();        
    }
}

