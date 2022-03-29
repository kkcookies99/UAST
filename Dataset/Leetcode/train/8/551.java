 class Solution {
    public int XXX(String s) {
        if (s == null || s == "") {
            return 0;
        }
        char[] charArr = s.toCharArray();

        StringBuilder sb = new StringBuilder();
        boolean isMinus = false;
        boolean isPositive = false;
        boolean inValid = false;

        for (int i = 0; i < charArr.length; i++) {
            char c = charArr[i];
            if (c == ' ' && sb.length() == 0) {
                continue;
            }
            if (c == '-' && sb.length() == 0) {
                sb.append(c);
                isMinus = true;
                continue;
            }
            if (c == '+' && sb.length() == 0) {
                sb.append(c);
                isPositive = true;
                continue;
            }
            if (Character.isDigit(c)) {
                sb.append(c);
            } else if (sb.length() > 0) {
                break;
            } else if (sb.length() == 0) {
                sb.append(0);
                break;
            }
        }

        String res = sb.toString();
        if ((isMinus || isPositive) && res.length() <= 1 || res.length() < 1) {
            res = "0";
        }
        if ((isMinus || isPositive) && res.length() > 1) {
            res = res.substring(1);
        }

        long finalNum = 0;
        try {
            finalNum = isMinus ? 0 - Long.valueOf(res) : Long.valueOf(res);
        } catch (Exception e) {
            inValid = true;
        }

        if (finalNum > Integer.MAX_VALUE || (inValid && !isMinus)) {
            return Integer.MAX_VALUE;
        } else if (finalNum < Integer.MIN_VALUE || (inValid && isMinus)) {
            return Integer.MIN_VALUE;
        } else {
            return (int)finalNum;
        }
    }
}

