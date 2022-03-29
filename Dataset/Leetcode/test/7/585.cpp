 class Solution {
public:
    int XXX(int x) {
        long long x1=0;//这里用long long是因为下面要用，自己看吧
        if(x>=0)//先分为正数和负数两种情况
            while(x)//先正常拆数
            {
                if(x1*10>2147483648) return 0;//若超出范围就返回0，如果前面x1不用long long就会报错
                x1=x1*10+x%10;
                x/=10;
            }
        else{//负数
            while(x)//一样正常拆数，但是因为是负数，要变一些东西，我是先把他转过来之后再加负号
            {
                if(x1*10>2147483648) return 0;//
                x1=x1*10+(-(x%10));//负数的最后一位是-（x%10）
                x/=10;
            }
            x1=-x1;//加负号
        }
        return x1;//输出
    }
};

