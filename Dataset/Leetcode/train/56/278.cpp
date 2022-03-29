 class Solution {
public:
    struct my
    {
        int val;
        bool isadd;
        my(int v, bool b) : val(v), isadd(b) {}
        bool operator<(const my& rhs) const
        {
            return (val < rhs.val || (val == rhs.val && isadd));
        }
    };
    vector<my> v;
    void build(vector<int>& v0)
    {
        my m1(v0[0], true);
        v.push_back(m1);
        my m2(v0[1], false);
        v.push_back(m2);
    }
    void gen(vector<vector<int>>& res)
    {
        int sum = 0;
        int begin = 0;
        int end = 0;
        for(auto& m : v)
        {
            if(m.isadd == true)
            {
                sum++;
                if(sum == 1)
                {
                    begin = m.val;
                }
            }
            else
            {
                sum--;
                if(sum == 0)
                {
                    end = m.val;
                    res.push_back({begin, end});
                }
            }
        }
    }
    vector<vector<int>> XXX(vector<vector<int>>& intervals) {
        for(auto& v0 : intervals)
        {
            build(v0);
        }
        stable_sort(v.begin(), v.end());
        vector<vector<int>> res;
        gen(res);
        return res;
    }
};

