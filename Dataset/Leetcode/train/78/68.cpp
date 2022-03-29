class Solution {
public:
    vector<vector<int>> XXX(vector<int>& nums) {
        vector<vector<int>> result(1);//这是个小技巧
        for(int i=0;i<nums.size();i++)
        {
            int ret_size=result.size();
            for(int j=0;j<ret_size;j++)
            {
                vector<int> temp=result[j];
                temp.push_back(nums[i]);
                result.push_back(temp);
            }
        }
        return result;
    }
};
//思路访问到 某一个元素，将其加入到之前 
所有元素得到的集合中，
然后组成新集合，再合并，之前的集合。

