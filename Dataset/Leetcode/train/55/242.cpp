class Solution {
public:
    bool XXX(vector<int>& nums) {
        int n=nums.size();
        int falg=1;
        for(int i=n-2;i>=0;i--){
            int d=1;
            if(nums[i]<d) falg=0;
            while(i>=0&&nums[i]<d){
                i--;
                d++;
            } 
            if(i>=0) falg=1;
        }           
        if(falg) return true;
        return false;
    }
};

