class Solution {
public:
    vector<vector<int>> XXX(vector<vector<int>>& intervals) {
        vector<vector<int>> ans;
        sort(intervals.begin(),intervals.end());
        int i = 0;
        while(i < intervals.size()){
            int temp = intervals[i][1];//记录当前的尾元素
            int j  = i + 1;
            while (j < intervals.size() && intervals[j][0] <= temp){//如果后一区间的前元素小于等于当前的尾元素，可合并
                temp = max(temp,intervals[j][1]);//更新temp为与后一区间尾元素的最大值（因为可能是包含与交集关系）
                j++;
            }     
            ans.push_back({intervals[i][0],temp});//出循环直接push到ans，temp就是合并后的尾元素了
            i = j;//不能重复遍历
        }
        return ans;
    }
};

