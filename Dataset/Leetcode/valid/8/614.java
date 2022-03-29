 class Solution {
    public int XXX(String s) {
        int len = s.length(), sign = 1, i = 0, result = 0;
        while(i < len && s.charAt(i) == ' '){i++;}//去掉左侧空格
        while(i < len){
            if(s.charAt(i) == '-' && i < s.length()-1 && Character.isDigit(s.charAt(i+1))){//表示负数
                    sign = -sign;
                    i++;
                    break;}
            else if(s.charAt(i) == '+' && i < s.length()-1 && Character.isDigit(s.charAt(i+1))){//表示正数
                    i++;
                    break;}
            else if(Character.isDigit(s.charAt(i))) {break;}//直接就是数字（正数）
            else{return 0;}
        }
        while(i < len && Character.isDigit(s.charAt(i))){
            if(result > Integer.MAX_VALUE/10 || (result == Integer.MAX_VALUE/10 && s.charAt(i)>='7')){return 2147483647;}//右侧越界
            if(result < Integer.MIN_VALUE/10 || (result == Integer.MIN_VALUE/10 && s.charAt(i)>='8')){return -2147483648;}//左侧越界
            result = result*10 + sign*(s.charAt(i++)-'0');
        }
        return result;
    }
}

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


