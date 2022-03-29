 class Solution {
    public int XXX(String s) {
        int n=s.length();
        long ans=0;
        char mark='+';
        boolean flag=false;
        for(int i=0;i<n;i++){
            char ch=s.charAt(i);
            if(!flag&&ch==' ') //前导空格跳过
                continue;
            else if(!flag&&(ch=='-'||ch=='+')){ //多于一个正负号的break
                mark=ch;
                flag=true;
            }
            else if(ch>='0'&&ch<='9'){
                ans=ans*10+(ch-'0');
                if(ans>Integer.MAX_VALUE){  //判断溢出
                    if(mark=='+')
                        return Integer.MAX_VALUE;
                    else if(mark=='-'&&ans>(long)(Integer.MAX_VALUE+1))
                        return Integer.MIN_VALUE;
                }
                flag=true; //数字flag为true
            }else
                break;
        }
        if(mark=='-')
            ans=0-ans;
        return (int)ans;

    }
}

