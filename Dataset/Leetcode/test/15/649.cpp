 class Solution {
public:
    vector<vector<int>> XXX(vector<int>& nums) {

        sort(nums.begin(), nums.end());

        vector<vector<int>> res;

        for(int i=0; i<nums.size(); i++){
            if(nums[i]>0){
                return res;
            }
            
            if(i>0 && nums[i]==nums[i-1]){
                continue;
                //相当于对nums[i]去重,注意i>0,防止漏掉-1,-1,2 这种情况
            }
            int left = i+1;
            int right = nums.size()-1;
            while(left < right){
                if(nums[i]+nums[left]+nums[right]<0){
                    left++;
                }
                else if(nums[i]+nums[left]+nums[right]>0){
                    right--;
                }
                else{
                    vector<int> tmp{nums[i], nums[left], nums[right]};  
                    res.push_back(tmp);
                    //去重left和right,在找到一组vector之后
                    while(left<right && nums[left]==nums[left+1]){
                        left++;
                    }
                    left++;
                    while(left<right && nums[right]==nums[right-1]){
                        right--;
                    }
                    right--;  //再--一次,因为right+1还是那个重复的数字
                    
                }
            }
        }

        return res;


    }
};

