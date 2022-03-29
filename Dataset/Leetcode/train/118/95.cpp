 class Solution {
public:
    vector<vector<int>> XXX(int numRows) {
        vector<vector<int>>ans;
        vector<int>p1;
        vector<int>p2;
        p1.push_back(1);
        if(numRows==1)
        {
            ans.push_back(p1);
            return ans;
        }
        ans.push_back(p1);
        for(int i=2;i<=numRows;i++)
        {
            p2.push_back(1);
            for(int j=0;j<i-2;j++)
            {
                p2.push_back(p1[j]+p1[j+1]);
            }
            p2.push_back(1);
            ans.push_back(p2);
            p1.clear();
            p1.swap(p2);
        }
        return ans;
    }
};

