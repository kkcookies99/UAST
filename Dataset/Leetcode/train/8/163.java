class Solution {
    public int XXX(String str) {
        if (str == null)
            return 0;
        str = str.trim();
        char[] chars = str.toCharArray();
        if (chars.length == 0)
            return 0;
        char c0 = chars[0];
        if (c0 != '-' && c0 != '+' && !Character.isDigit(c0))
            return 0;
        if (c0 == '-' || c0 == '+') {
            if (chars.length == 1)
                return 0;
            else if (!Character.isDigit(chars[1]))
                return 0;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(c0);
        int i = 1;
        while (i < chars.length){
            if (!Character.isDigit(chars[i]))
                break;
            sb.append(chars[i]);
            i++;
        }
        int res = 0;
        try {
            res = Integer.parseInt(sb.toString());
        } catch (Exception e) {
            if (c0 == '-')
                return Integer.MIN_VALUE;
            else 
                return Integer.MAX_VALUE;
        }
        return res;
    }
}

