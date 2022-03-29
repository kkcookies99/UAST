 class Solution {
public:
    vector<vector<int>> XXX(vector<vector<int>>& intervals) {
        if (intervals.size() == 0 || intervals[0].size() == 0)
        {
            return {};
        }
        vector<vector<int>> resp = {};
        vector<int> temp = {};
        
        //先排序
        sort(intervals.begin(), intervals.end());

        for (int row = 0; row < intervals.size() ; row ++)
        {
            if (temp.size() == 0) //临时变量无值，直接设入temp
            {
                temp.push_back(intervals[row][0]);
                temp.push_back(intervals[row][1]);
            }
            else if (temp.size() == 2) //如果已存在设入temp的值，则比较[0]的大小
            {
                if (temp[1] >= intervals[row][0]) //temp的最后一个元素大于[0]
                {
                    if (temp[1] < intervals[row][1]) //temp的最后一个元素小于[1]
                    {
                        temp.pop_back();
                        temp.push_back(intervals[row][1]); //替换temp的第二个元素
                    } //temp的元素不需要替换，则循环判断是否要替换
                }
                else 
                {
                    resp.push_back(temp); //temp的最后一个元素 小于[0] 说明temp不在区间，则push到resp中
                    temp.clear(); //清理
                    temp.push_back(intervals[row][0]);//将当前元素设置到temp中
                    temp.push_back(intervals[row][1]);
                }
            }
        }
        if (temp.size() == 2) //兜底，循环的最后一次进行了temp的push，需要将元素继续push到resp中
        {
            resp.push_back(temp);
        }
        return resp;
    }
};

