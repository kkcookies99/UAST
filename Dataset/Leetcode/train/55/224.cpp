class Solution {
public:
    bool XXX(vector<int>& nums) {
        int n = (int)nums.size();
        if(n==1) return true;
        for(int i=n-1;i>=0;i--){
            if(nums[i]==0){
                int mark = 0;
                for(int j=i-1;j>=0;j--){
                    if(nums[j]>(i-j) || (nums[j]==(i-j) && i==n-1)){
                        mark = 1;
                        i = j;
                        break;
                    }
                }
                if(mark==0){
                    return false;
                }
            }
        }
        return true;
    }
};

