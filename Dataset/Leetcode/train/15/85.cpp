 class Solution {
public:
    vector<vector<int>> XXX(vector<int>& nums) {
        if(nums.size()<=2){
            return {};
        }

        sort(nums.begin(), nums.end());
        vector<vector<int>> result;
        
        for(int first=0;first<nums.size()-1&&nums[first]<=0;first++){
            // get rid of same number
            if(first==0 || nums[first]!=nums[first-1]){
                int second = first+1;
                int third = nums.size()-1;
                
                while(second<third){
                    // get rid of same number
                    if(second == first+1 || nums[second]!=nums[second-1]){
                        // decrease third number until the value become negative
                        while(second < third && nums[third]>=0 && nums[first]+nums[second]+nums[third]>0){
                            third--;
                        }
                        // if no valid third found then break
                        if(second>=third){
                            break;
                        }
                        // check whether combination suits
                        if(nums[first]+nums[second]+nums[third]==0){
                            result.push_back({nums[first], nums[second], nums[third]});
                        }
                    }
                    // increase second
                    second++;
                }
            }
        }

        return result;
    }
};

