class Solution {
public:
    int XXX(int n) {
        int d[n+1];//定义的d[i]为方法数量
        if(n<3) return n;
        d[1] = 1;
        d[2] = 2;
        //d[3] = d[2]+d[1]
        for(int i=3;i<=n;i++){
            d[i] = d[i-1]+d[i-2];
        }
        return d[n];
    }
};

