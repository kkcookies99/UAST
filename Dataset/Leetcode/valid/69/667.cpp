class Solution {
public:
    int XXX(int x) {
        float half=0.5*x,ans=x;
        int i=*(int*)&ans;//整数读
        i=0x5f3759df-(i>>1);//!!!
        ans=*(float*)&i;//浮点读 
        ans=ans*(1.5-half*ans*ans);//牛顿迭代
        ans=ans*(1.5-half*ans*ans);//牛顿迭代
        ans=1/ans;//平方根倒数
        int pre=(int)ans;//取整
        return (pre*pre<=x)?pre:pre-1;
    }
};

