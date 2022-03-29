 class Solution {
    public int XXX(String s) {
        int res = 0;//记录最后的结果
        int tempL = 0, tempR = 0;//记录s[i]每次变化的值
        for(int i = s.length()-1;i >= 0;i--){
            tempR = tempL;//记录上一个temp的值，也就是位于罗马数字的数值
            switch(s.charAt(i)){
                case 'I':tempL = 1;break;
                case 'V':tempL = 5;break;
                case 'X':tempL = 10;break;
                case 'L':tempL = 50;break;
                case 'C':tempL = 100;break;
                case 'D':tempL = 500;break;
                case 'M':tempL = 1000;break;
                default:break;
            }
            //比较左右罗马数字的数值
            if(tempL<tempR){
                res -= tempL;
            }else{
                res += tempL;
            }
        }
        return res;
    }
}

