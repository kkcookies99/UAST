class Solution {
public:
    int XXX(int x) {
        if(x>=0 && x/10 <1 ) return x;// 快速过滤掉个数的
        if(x<0 && x/10 >-1 ) return x;

        int y = 0;
        bool isNeg = 0;
        if(x<0){
            if(x==INT_MIN) return 0;
            x = -x;
            isNeg = 1;
        }
        
        int fig =log10(x); // 判断位数
        int i = 0;
        while(x>0){
            i = x%10;//获得x的最后一位
            if(y-(i*pow(10,fig))<INT_MIN)return 0;
            y -= i*pow(10,fig);//减去x最后位数字*位数
            fig--; 
            x /= 10;
        }
        if(!isNeg){
            if(y==INT_MIN) return 0;
            y = -y;
        }
        return y;
    }
};

