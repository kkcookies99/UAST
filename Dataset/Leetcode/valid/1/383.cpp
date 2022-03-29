 class Solution {
public:
    vector<int> XXX(vector<int>& nums, int target) {
        unordered_map<int,int> myumap;
        for (int i = 0; i < nums.size(); i++) myumap.emplace(nums[i],i);//用umap存一下num和index;(数组元素映射到索引)
        for (int i = 0; i < nums.size(); i++) {
            int other = target - nums[i];
            if (myumap.count(other) && myumap.at(other) != i) {//如果other存在且不是nums[i]本身
                return {i, myumap.at(other)};//返回索引i和other的索引.at(other)
            }
        }
        return {-1, -1};
    }
};

