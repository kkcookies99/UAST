 class Solution {
    public int XXX(String s) {
        int res = 0, x = 0;
        boolean isNegative = false, flag = true;
        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == ' ' && flag) {
                continue;
            }
            if(s.charAt(i) == '+' && flag) {
                flag = false;
                continue;
            }
            if(s.charAt(i) == '-' && flag) {
                isNegative =  true;
                flag = false;
                continue;
            }
            try{
                x = Integer.parseInt(String.valueOf(s.charAt(i)));
            }catch(Exception e) {
                return isNegative ? -res : res;
            }
            try{
                res = Math.multiplyExact(res, 10);
                res = Math.addExact(res, x);
            }catch(Exception e) {
                return isNegative ? Integer.MIN_VALUE : Integer.MAX_VALUE;
            }
            flag = false;
        }
        return isNegative ? -res : res;
    }
}

