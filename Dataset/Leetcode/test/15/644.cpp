 class Solution {
public:
    vector<vector<int>> XXX(vector<int>& nums) {
        vector<vector<int>> res;
        //将数组变有序
        sort(nums.begin(),nums.end());
        //穷举 XXX 的第一个数
        for(int i = 0;i < nums.size();i++){
             // 对 0 - nums[i] 计算 XXX
            int XXX = 0 - nums[i];
            vector<vector<int>> tuples = TwoSum(nums,i + 1,XXX);
            //如果存在满足条件的二元组，再加上 nums[i] 就是结果三元组
            for(int j = 0;j < tuples.size();j++){
                vector<int> tuple = tuples[j];
                tuple.insert(tuple.begin(),nums[i]);
                res.push_back(tuple);
            }
            // 跳过第一个数字重复的情况，否则会出现重复结果
            while(i + 1 < nums.size() && nums[i] == nums[i + 1]) i++;
        }
        return res;
    }
    vector<vector<int>> TwoSum(vector<int>& nums,int start,int target){
        vector<vector<int>> res;
        int l = start;
        int r =  nums.size() - 1;
        while(l < r){
            int left = nums[l];
            int right = nums[r];
            int sum = left + right; 
            if(sum < target){
                //跳过相同的元素
                while(l < r && nums[l] == left) l++;
            }else if(sum > target){
                //跳过相同的元素
                while(l < r && nums[r] == right) r--;
            }else if(sum == target){
                //保存结果
                res.push_back({left,right});
                //跳过相同的元素
                while(l < r && nums[l] == left) l++;
                while(l < r && nums[r] == right) r--;
            }
        }
        return res;
    }
    
};

