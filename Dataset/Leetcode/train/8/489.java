 class Solution {
    public int XXX(String s) {
        char[] chs=s.toCharArray();
        int k=0;
        while(k<chs.length&&chs[k]==' ') k++;
        if(k==chs.length) return 0;
        int minus=1;
        if(chs[k]=='-'){
            minus=-1;
            k++;
        }
        else if(chs[k]=='+'){
            minus=1;
            k++;
        }
        int res=0;
        while(k<chs.length&&chs[k]>='0'&&chs[k]<='9'){
            int x=chs[k]-'0';
            if(res>(Integer.MAX_VALUE-x)/10){
                return minus==1?Integer.MAX_VALUE:Integer.MIN_VALUE;
            }
            res=res*10+x;
            k++;
        }
        return minus*res;
    }
}

