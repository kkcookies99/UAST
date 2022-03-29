 class Solution {
    public boolean XXX(String s) {
        char[] chs = s.toCharArray();
        for(int i=0,j=chs.length-1;i<j;++i,--j){
            while(i<j&&!isChar(chs[i])) ++i;
            while (i<j&&!isChar(chs[j])) --j;
            if(!equal(chs[i],chs[j])) return false;
        }
        return true;
    }
    private boolean isChar(char ch){
        return (ch>='0'&&ch<='9')||(ch>='a'&&ch<='z')||(ch>='A'&&ch<='Z');
    }
    private boolean equal(char ch1,char ch2){
        if(ch1>='0'&&ch1<='9'){
            return ch1==ch2;
        }else if(ch1>='a'&&ch1<='z'){
            return ch1==ch2||ch1==ch2-'A'+'a';
        }else {
            return ch1==ch2||ch1==ch2+'A'-'a';
        }
    }
}

