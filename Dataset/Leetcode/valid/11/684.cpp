 class Solution {
public:
    int XXX(vector<int>& height) {
        int maxA = 0;
        int i = 0, j = height.size()- 1;
        while(i < j)
        {
            maxA = max(maxA, (j-i)*min(height[i], height[j]));
            if(height[i]<=height[j]) i ++;
            else j--;
        }
        return maxA;
        
    }
};

