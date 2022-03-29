class Solution {
public:
    void backtrace(vector<int >& nums, int index,vector<int>& tmp,vector<vector<int> >& res){
        if(index >= nums.size()){
            res.push_back(tmp);
            return;
        }
        for(int i = index;i<nums.size();++i){
            swap(nums[index],nums[i]);   //将每次要选择的数放到首位，方便接下来递归
            tmp.push_back(nums[index]);
            backtrace(nums,index+1,tmp,res);
            tmp.pop_back();
            swap(nums[index],nums[i]);   //还原
        }
        return;
    }

    vector<vector<int>> XXX(vector<int>& nums) {
        vector<vector<int> > res;
        vector<int> tmp;
        backtrace(nums,0,tmp,res);
        return res;
    }
};

