 class Solution {
public:
    bool intersect(const vector<int>& i1, const vector<int>& i2)
    {
        return (i1[1] >= i2[0] && i1[1] <= i2[1]) ||
        (i2[1] >= i1[0] && i2[1] <= i1[1]);
    }
    bool join(const vector<int>& i1, vector<int>& i2)
    {
        if(intersect(i1, i2))
        {
            i2[0] = min(i1[0], i2[0]);
            i2[1] = max(i1[1], i2[1]);
            return true;
        }
        else
        {
            return false;
        }
    }
    vector<vector<int>> XXX(vector<vector<int>>& intervals) {

        int n = intervals.size();
        if(n == 1)
        {
            return intervals;
        }

        sort(intervals.begin(), intervals.end());
        vector<vector<int> > ret;
        for(int i = 0; i < n; i ++)        
        {
            if(i + 1 < n)
            {
                if(join(intervals[i], intervals[i + 1]))
                {
                }
                else
                {
                    ret.push_back(intervals[i]);
                }
            }
        }
        ret.push_back(intervals[n - 1]);
        return ret;

    }
};

