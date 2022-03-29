 class Solution {
public:
    bool XXX(vector<int>& nums) {
        vector<int>temp;
        temp.resize(nums.size());
        if(nums[0]==0){
            if(nums.size()==1)  return 1;
            else return 0;
        }
        else temp[0]=1;
        for(int i=1;i<nums.size();i++){
            for(int j=i-1;j>-1;j--){
                if(nums[j]>=i-j&&temp[j]==1)  {temp[i]=1; break;}
            }
        }
        if(temp[nums.size()-1]==1) return 1;
        else return 0;
    }
};

