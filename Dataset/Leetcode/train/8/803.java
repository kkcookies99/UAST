 class Solution {
    public int XXX(String str) {
        StringBuilder sb = new StringBuilder();
        str = str.trim();
        int i = 0;
        boolean plus = true;
        if (str.equals("")) {
            return 0;
        }
        if (str.charAt(0) == '-') {
            plus = false;
            str = str.substring(1);
        } else if (str.charAt(0) == '+') {
            str = str.substring(1);
        }
        if (str.equals("")) {
            return 0;
        }
        if(Character.isDigit(str.charAt(0))) {
            while (i < str.length()) {
                if (!Character.isDigit(str.charAt(i))) {
                    break;
                }
                sb.append(str.charAt(i));
                i++;
            }
            String res = sb.toString();
            double dou = plus ? Double.parseDouble(res) : 0 - Double.parseDouble(res);
            if (dou > 2147483647) {
                return 2147483647;
            }
            if (dou < -2147483648) {
                return -2147483648;
            }
            return (int) dou;
        }else {
            return 0;
        }

    }
}

