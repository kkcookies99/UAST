 class Solution {
    public String XXX(String s) {
        int n=s.length();
        int i=0,start=0,end=0;
        while(i<n){
            //这是一段正确代码，我有个地方不太明白，大家看我的注释推演，帮我解惑，示例：abctcyu
            int j=i;
            //此时j和i=0
            while( j+1<n && s.charAt(j)==s.charAt(j+1)) j++;
            //由于&&后面那个条件不满足，故j并没有增加仍为0
            int left=i,right=j;
            //此时left、i、right、j都为0
            while(left>=0 && right<n && s.charAt(left)==s.charAt(right)){
                left--;
                right++;
            }
            //满足while条件，此时left=-1、right=1
            if(right-left>end-start){
                start=left;
                end=right;
            }
            //这里start=-1、end=1
            i=j+1;
            //这里i=1，j仍然是0
        }
        return s.substring(start+1,end);
        //返回a
        //这是为什么？推演哪里出错了吗？
    }
}

