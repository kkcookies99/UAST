 class Solution {
public:
    vector<vector<int>> XXX(vector<int>& nums) {
             vector<vector<int>> result;
             int length=nums.size(),i=0;
             if(length<3) return result;
             sort(nums.begin(),nums.end());
             while(i<length-1){
                 if(nums[i]>0) return result;
                 if(nums[i]==nums[i-1]) {i++;continue;}
                 int left=i+1,right=length-1;
                 while(left<right){
                     if(nums[i]+nums[left]+nums[right]<0) left++;
                     else if(nums[i]+nums[left]+nums[right]>0) right--;
                     else {
                         vector<int> temp;
                        temp.push_back(nums[i]);
                        temp.push_back(nums[left]);
                        temp.push_back(nums[right]);
                        result.push_back(temp);
                         while(left<right&&nums[left]==nums[right-1]) right--;
                         while(left<right&&nums[right]==nums[left+1]) left++;
                         left++;
                         right--;
                     }    
                 }
                 i++;
             }
             return result;
    }
};

