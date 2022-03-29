 class Solution {
public:
    int XXX(vector<int>& height) {
        int ans=0;
        int le=0, ge=height.size()-1;
        while(le<ge)
        {
            int h=min(height[le],height[ge]);
            ans=max(ans, h*(ge-le));
            if(height[le]<height[ge]) le++;
            else ge--;
        }
        return ans;
    }
};

