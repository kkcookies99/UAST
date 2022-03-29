class Solution {
    public int XXX(String str) {
        if(str==null||str.length()==0)return 0;
        int i=0,flag=1,num=0;
        long ret=0;
        while(i<str.length()&&str.charAt(i)==' ')i++;
        if(i<str.length()&&(str.charAt(i)=='+'||str.charAt(i)=='-')){
            flag = str.charAt(i)=='+'?1:-1;
            i++;
        }
        while(i<str.length()&&str.charAt(i)=='0')i++;
        if(i<str.length()&&str.charAt(i)>='0'&&str.charAt(i)<='9'){
            while(i<str.length()&&str.charAt(i)>='0'&&str.charAt(i)<='9'){
                ret=ret*10+str.charAt(i++)-'0';
                num++;
            } 
        }
        ret*=flag;
        if(flag==1&&(ret>Integer.MAX_VALUE||num>10))
                return Integer.MAX_VALUE;
        if(flag==-1&&(ret<Integer.MIN_VALUE||num>10))
                return Integer.MIN_VALUE;
        return (int)ret;
    }
}

