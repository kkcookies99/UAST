 class Solution {
public:
    vector<vector<int>> XXX(vector<int>& nums) {
        vector<vector<int>> x;
        sort(nums.begin(),nums.end());
        for(int i = 0; i < nums.size() && nums[i]<=0; i++){
            if(i>0&&nums[i]==nums[i-1]){continue;}
            for(int j =nums.size()-1; j > i && nums[j] >= 0; j--){
                if(j<nums.size()-1 && nums[j] == nums[j+1]){continue;}
                int cha = -nums[i]-nums[j];                    
                for(int move=j-1;move>i && nums[move]>=cha;move--){
                    if (nums[move]==cha){
                        vector<int> y;
                        y.push_back(nums[i]);
                        y.push_back(nums[move]);
                        y.push_back(nums[j]);
                        x.push_back(y);
                        break;
                    }
                }
            }
        }
    return x;
       
        
    }
};

