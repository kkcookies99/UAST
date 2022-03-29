class Solution {
public:
    //dp.search
    vector<vector<int>>dp;
    vector<int>nums;
    int len;
    vector<vector<int>> XXX(vector<int>& num) {
        dp.push_back(nums);
        nums.assign(num.begin(),num.end());
        len=nums.size();
        vector<int>temp;
        main(0,temp);
        return dp;
    }
    void main(int i,vector<int> temp){
        if(i==len)    return;
        else{
            main(i+1,temp);
            temp.push_back(nums[i]);
            dp.push_back(temp);
            main(i+1,temp);
        }
        return;
    }
};

