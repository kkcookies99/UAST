 class Solution {
public:
    int XXX(vector<int>& prices) {
        int minP = 1e9, XXX = 0;
        for(int p:prices){
            minP = min(minP, p);    //这两句位置可以互换
            XXX = max(XXX, p - minP);
        }
        return XXX;
    }
};

