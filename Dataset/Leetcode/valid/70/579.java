class Solution {
    public int XXX(int n) {
        if(n==1)
            return 1;
        if(n==2)
            return 2;
        int a=1,b=2,temp;
        //从第三阶开始 都是前两阶的和
        // 因为要么爬一步上去(此时在n-1阶)  要么爬两步上去(在n-2阶)
        for(int i=3;i<=n;i++){
            temp=a;
            a=b;
            b=temp+a;
        }
        return b;
        //实际上就是斐波那契数列 但是递归会超出时间限制 XXX(n-1)+XXX(n-2);
    }
}

