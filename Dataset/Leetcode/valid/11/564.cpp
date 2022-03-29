 class Solution {
public:
    int XXX(vector<int>& height) {
        int left = 0, right = height.size()-1;
        int maxN = 0;
        for(;left<right;){       
            int minHeight = height[left] < height[right] ? height[left++] : height[right--];
            maxN = max(maxN, minHeight*(right-left+1));
        }
        return maxN;
    }
};

