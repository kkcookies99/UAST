 class Solution {
    //从中间到两边去寻找回文子串。
    //找奇数和偶数的回文子串
    String maxString="";
    int maxlength=0;
    int n=0;
    String s;
    public String XXX(String s) {
         this.s=s; 
        n=s.length();
       
        for(int i=0;i<n;i++)
        {
            //奇数回文子串
            find(i,0);
            //偶数回文子串
            find(i,1);
        }
        return maxString;
    }
    public void find(int i,int flag){
        int left=i;
        int right=i+flag;
        while((left>=0)&&(right<n)&&(s.charAt(left)==s.charAt(right)))
        {
            left--;
            right++;
        }
        //满足条件之后分别往左往右，所以起始处要+1，结尾处要-1
        if(right-left+1>maxlength)
        {
            maxString=s.substring(left+1,right);
            maxlength=right-left+1;
        }
    }
}

