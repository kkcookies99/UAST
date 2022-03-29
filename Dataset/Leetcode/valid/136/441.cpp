 class Solution {
public:
    int singleNumber(vector<int>& nums) {
        for(int i=0;i< nums.size()-1;i++){
            vector<int>:: iterator it = find( nums.begin()+i+1,nums.end(),nums[i]);
            if( it != nums.end()){//不在
                nums.erase(nums.begin() + distance(nums.begin(),it));
                nums.erase(nums.begin() + i);               
                i = -1 ;
            }
            else{//在               
                return nums[i];
            }
        }
        return nums[0];
    }
};

