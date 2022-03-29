 class Solution {
public:
    vector<vector<int>> XXX(vector<int>& nums) {
        //排序，方便去重
        sort(nums.begin(),nums.end());
        vector<int> path;
        int sum = 0;
        backtrace(path,0,sum,nums);
        return res;
    }
    vector<vector<int>> res;
    //用start控制，从左向右找，不可逆
    void backtrace(vector<int>& path,int start,int &sum,vector<int>& nums){
        //找到一组答案，保存到res
        if(path.size() == 3 && sum == 0){
            res.push_back(path);
            return;
        }
        //剪枝
        if(path.size() == 3 && sum != 0)
            return;
        //剪枝
        if(path.size() < 3 && sum > 0)
            return;
        //从start开始从左向右顺序选择当前层可选的待选元素（本质上就是暴力穷举）
        for(int i = start; i < nums.size(); i++){
            //进行选择
            path.push_back(nums[i]);
            sum += nums[i];
            //递归进入下一层的选择
            backtrace(path,i+1,sum,nums);
            //回溯，撤销本次选择
            sum -= nums[i];
            path.pop_back();
            //去重
            while(i + 1 < nums.size() && nums[i + 1] == nums[i]) i++;
        }
    }
};

