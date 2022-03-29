class Solution {
    public int XXX(String s) {
        int n = s.length();
        boolean isNagative = false;
        boolean foundNum = false;
        long num = 0L;
        int i = 0;
        while (i < n) {
            if (s.charAt(i) == ' ') {
                ++i;
            } else {
                break;
            }
        }
        for (; i < n; ++i) {
            if (foundNum) {
                if (isNum(s, i)) {
                    num = num * 10 + (s.charAt(i) - '0');
                    if (num > Math.pow(2, 31)) {
                        num = (long) Math.pow(2, 31);
                        if (isNagative) {
                            num *= -1;
                        }
                        break;
                    } 
                } else {
                    break;
                }
            } else {
                if (s.charAt(i) == '-') {
                    isNagative = true;
                    if (i + 1 < n && !isNum(s, i + 1)) {
                        break;
                    }
                } else if (s.charAt(i) == '+') {
                    if (i + 1 < n && !isNum(s, i + 1)) {
                        break;
                    }
                } else if (isNum(s, i)) {
                    foundNum = true;
                    num = s.charAt(i) - '0';
                } else {
                    break;
                }
            }
        }
        if (isNagative && (num > 0 && num <= Math.pow(2, 31))) {
            num *= -1;
        }
        if (num < -1 * Math.pow(2, 31)) {
            num = -1 * (long) Math.pow(2, 31);
        } else if (num > Math.pow(2, 31) - 1) {
            num = (long) (Math.pow(2, 31) - 1);
        } 
        return (int) num;
    }

    public boolean isNum(String s, int index) {
        return s.charAt(index) >= '0' && s.charAt(index) <= '9';
    }
}

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }

