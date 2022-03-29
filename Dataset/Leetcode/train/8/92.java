class Solution {
    public int XXX(String s) {
        s = s.trim();
        int symbol = 1;//0：负数，1：正数
        boolean b = s.startsWith("-");
        boolean b2 = s.startsWith("+");
        if(b){
            symbol = 0;
            s = s.substring(1);
        }else if(b2){
            s = s.substring(1);
        }
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if(!Character.isDigit(chars[i])){
                s = s.substring(0,i);
                break;
            }
        }
        if(s.equals("")){
            return 0;
        }
        try {
            return symbol == 0 ? -Integer.parseInt(s) : Integer.parseInt(s);
        } catch (NumberFormatException e) {
            if(symbol == 0){
                return Integer.MIN_VALUE;
            }
            return Integer.MAX_VALUE;
        }
    }
}

