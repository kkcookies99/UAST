 class Solution {
public:
    int XXX(vector<int>& height) {
        if(height.size()<2) return 0;
        
        int ans = 0;
        int l = 0, r = height.size() - 1;
        while(l<r){
            ans = max(ans, (r - l)*min(height[r], height[l]));
            
            if(height[r] > height[l]){
                int tmp = height[l];
                while(l<r && height[++l]<=tmp);
            }else{
                int tmp = height[r];
                while(r>l && height[--r]<=tmp);
            }
        }
        return ans;
    }
};

