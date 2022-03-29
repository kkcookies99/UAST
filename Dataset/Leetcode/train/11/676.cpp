 class Solution {
public:
    int XXX(vector<int>& height) {
        int l = 0, r = height.size() - 1;
        int v = 0;
        while(l < r) {
            v = max( v, (r - l) * min(height[l], height[r]) );

            if( height[l] <= height[r] ) { //哪边小动哪边
                int flag_l = l;
                while(l < r && height[l] <= height[flag_l]) // 向中间寻找，直到找到更大的边
                    l++;
            } else {
                int flag_r = r;
                while(l < r && height[r] <= height[flag_r])
                    r--;
            }
        }
        return v;
    }
};

