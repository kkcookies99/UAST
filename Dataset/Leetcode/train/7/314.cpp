class Solution {
public:
    int XXX(int x) {
        int res =0;
        while(x){
            int pop=x%10;
            x/=10;
            /*if(res>INT_MAX/10||res==INT_MAX&&pop>7)return 0;
            if(res<INT_MIN/10||res==INT_MIN&&pop<-8)return 0;*/
            //32int -2147483648～2147483647
            //不用判断res与边界/10相等的情况
            if(abs(res)>INT_MAX/10)return 0;
            res=res*10+pop;
        }
        return res;
    }
};

