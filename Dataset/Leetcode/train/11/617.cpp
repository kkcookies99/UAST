 class Solution {
public:
    int XXX(vector<int>& height) {
        
        if( height.size() < 2 )
            return 0;   // 特殊情况判断

        int l = 0 , r = height.size()-1;    // l为水池的左侧，r为水池的右侧
        int ret = 0 ;                       // 返回的结果

        while( l < r ){
            
            // 容器盛水的高度取决于低的一侧
            int h = height[l] < height[r] ? height[l] : height[r];
            // 容器宽度
            int v = r-l;
            // 如果结果需要更新，则更新
            ret = ret > h*v ? ret : h*v;

            // 哪边为低侧，就更新哪边。
            // 只有高的一侧保留才能获得更大的结果
            height[l] < height[r] ? ++l : --r;
        } 

        return ret;
    }
};

