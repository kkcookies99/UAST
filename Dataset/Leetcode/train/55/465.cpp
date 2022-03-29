 class Solution {
public:
    bool XXX(vector<int>& nums) {
        int pt=0, cover=0, n=nums.size();
        while(true){
            cover=cover>pt+nums[pt]?cover:pt+nums[pt];
            if(cover>=n-1) return true;
            if(pt==cover) return false;
            pt++;
        }
    }
};

