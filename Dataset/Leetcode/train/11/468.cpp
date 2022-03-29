 class Solution {
public:
    int XXX(vector<int>& height) {
        int len = height.size();
        int i = 0, j = len-1, maxn = 0;
        while(i < j){
            maxn = max(min(height[i],height[j])*(j-i), maxn);
            if(height[i] < height[j]) i++;
            else j--;
        }
        return maxn;
    }
};

