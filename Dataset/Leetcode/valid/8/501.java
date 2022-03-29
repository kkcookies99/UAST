 class Solution {
    public int XXX(String s) {
        if(s.length()==0) return 0;
        char[] chars = s.toCharArray();
        int ans=0;
        int index=0;
        int flag=0;//记录正负号
        while(index<s.length()&&chars[index]==' ') index++;
        if(index==s.length()) return 0;
        if(chars[index]=='-') flag=1;
        if(chars[index]=='+'||chars[index]=='-') index++;
        while(index<s.length()&&Character.isDigit(chars[index])){
            int cur=chars[index]-'0';
            if((ans>Integer.MAX_VALUE/10)||(ans==Integer.MAX_VALUE/10&&cur>7)){
                return flag==1?Integer.MIN_VALUE:Integer.MAX_VALUE;
            }
            ans=ans*10+cur;
            index++;
        }
        return flag==1?-ans:ans;
    }
}

