 class Solution {
public:
    int XXX(vector<int>& nums, int target) {
        int beg = 0, end = nums.size() - 1;
        int mid = end/2;
        int i = 0;
        if (nums.size() == 1){
            if(nums[0] == target)
                return 0;
            else if(target<nums[0]){
                return 0;
            }
            else return 1;
        
        
                
        }
        while(beg != end && nums[mid] != target){
            if(target < nums[mid])
                end = mid;
            else
                beg = mid + 1;
            mid = beg + (end - beg)/2;

        }
        if(nums[mid] == target)
            return mid;
        else{
            int ans = 0;
            for( i = 0; i< nums.size(); i++){
                if(i == nums.size()-1)
                    return nums.size();
                if(nums[i]>target ){
                    ans = i;
                    break;
                }
                if(nums[i]<target && nums[i+1]>=target){
                    ans = i+1;
                    break;
                }
                
                
                    
            }
            return ans;

        }
    }
};

