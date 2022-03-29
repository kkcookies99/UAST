 class Solution {
public:
    int XXX(vector<int>& height) {
        
        int l = 0;
        int r = height.size() - 1 ;         // [l,r]为检索范围 ， l r双指针
        
        int len = 0;                        // 宽 横坐标差
        int minindex = 0;                   // 较低端的横坐标l/r
        int ret = 0;                        // 结果

        while( l < r ){
            
            len = r-l;                                          
            minindex = height[l] < height[r] ? l++ : r-- ;      
            ret = max( ret , len*height[minindex] );
        }
        return ret ;
    }
};

