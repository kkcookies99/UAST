 class Solution {
    public int XXX(String str) {
        int len = str.length();
        if(len==0)
            return 0;
        char[] c = str.toCharArray();
        int i = 0;
        boolean flag = false;
        while(i<len&&c[i]==' ') i++;
        if(i==len) return 0;
        if(c[i]=='-'){
            flag = true;
            i++;
        } 
        else if(c[i]=='+')
            i++;
        else if(c[i]<'0'||c[i]>'9')
            return 0;
        long num = 0;
        while(i<len&&c[i]>='0'&&c[i]<='9'){
            num = num*10 + c[i]-'0';
            if(!flag&&num>Integer.MAX_VALUE||flag&&-num<Integer.MIN_VALUE)
                break;
            i++;
        }
        num = flag==false?num:-num;
        if(num>0&&num>Integer.MAX_VALUE)
            return Integer.MAX_VALUE;
         if(num<0&&num<Integer.MIN_VALUE)
            return Integer.MIN_VALUE;
        return (int)num;



    }
}

