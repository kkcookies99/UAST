 class Solution {
    public int XXX(String s) {
        char[] charArr = s.trim().toCharArray();
        if(charArr.length==0)return 0;
        int symbol = 1;
        int start = 1;
        int res = 0;
        if(charArr[0]=='-'){
            symbol = -1;
        }else if(charArr[0]!='+'){
            start = 0;
        }
        for(int i = start; i < charArr.length; i++){
            if(charArr[i]>'9'||charArr[i]<'0'){
                break;
            }
            if(res>214748364||res==214748364&&charArr[i]>'7'){
                return symbol==1?Integer.MAX_VALUE:Integer.MIN_VALUE;
            }
            res = res*10 + (charArr[i]-'0');
        }
        return symbol*res;
    }
}

