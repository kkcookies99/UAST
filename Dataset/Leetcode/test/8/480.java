 class Solution {
    public int XXX(String s) {
        int res = 0, x = 0;
        boolean isNegative = false, flag = true; // flag判断空格或者加减号是否出现在字符串的开头而不是中间
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
                x = Integer.parseInt(String.valueOf(s.charAt(i))); // 当前字符不是数字就捕获异常，并返回之前的结果
            }catch(Exception e) {
                return isNegative ? -res : res;
            }
            try{
                res = Math.multiplyExact(res, 10); // 捕获乘法溢出
                res = Math.addExact(res, x); // 捕获加法溢出
            }catch(Exception e) {
                return isNegative ? Integer.MIN_VALUE : Integer.MAX_VALUE;
            }
            flag = false;
        }
        return isNegative ? -res : res;
    }
}

