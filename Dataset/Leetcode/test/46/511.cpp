 class Solution {
public:
    vector<vector<int>> XXX(vector<int>& nums) {
        size = nums.size();
        backtrace(nums);
        return results;
    }

    void backtrace(vector<int> nums) {
        if(tmp.size() == size) {
            results.push_back(tmp);//临时数组数量等于目标数量时，存储到结果中
            return;
        }
        for(int i=0; i<nums.size(); i++) {
            int num = nums[i];
            //将值存储在数组中，并删除该值
            tmp.push_back(nums[i]);
            swap(nums[i], nums[nums.size()-1]);
            nums.pop_back();

            backtrace(nums);//将已经删除使用过的值的数组，继续迭代

            //将数组还原
            nums.push_back(num);
            swap(nums[i], nums[nums.size()-1]);
            tmp.pop_back();
        }
    }

private:
    vector<vector<int>> results;
    vector<int> tmp;
    int size;
};

