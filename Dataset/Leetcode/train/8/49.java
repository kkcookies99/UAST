class Solution {
    public int XXX(String s) {
        s=s.trim();
        if(s.length()<1)return 0;
        char[] a=s.toCharArray();
        long sum=0;
        if(a[0]=='-'||a[0]=='+'||(a[0]>='0'&&a[0]<='9')){
                for(int i=0;i<a.length;i++){
                    if((a[i]=='-'||a[i]=='+')&&i==0)continue;
                    if(a[i]>='0'&&a[i]<='9'){
                        sum=(a[i]-'0')+sum*10;
                    }else break;
                    if(-sum<=-2147483648&&a[0]=='-')return -2147483648; 
                    if(sum>=2147483647&&a[0]!='-')return 2147483647;
                }
        }else return 0;
        return a[0]=='-'?(int)-sum:(int)sum;
    }
}

