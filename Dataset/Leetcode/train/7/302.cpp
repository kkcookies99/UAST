class Solution {
public:
    int XXX(int x) {
        int pre=x % 10;
        long XXX=0;
        while(x!=0){
            x /= 10;
            XXX = XXX * 10 + pre;
            if((int)XXX % 10 != pre)
                return 0 ;
            pre = x % 10;
        }
        return XXX;
    }
};

