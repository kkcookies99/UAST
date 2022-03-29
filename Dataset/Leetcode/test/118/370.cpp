 class Solution {
public:

    //递归
    void dfsGenerate(int numRows, vector<vector<int>>& res, int currow, vector<int>& vec)
    {
        if(currow == numRows)
            return;
        vec.push_back(1);
        for(int i = 0; i < res.back().size() - 1; i++)
            vec.push_back(res.back()[i] + res.back()[i + 1]);
        vec.push_back(1);
        res.push_back(vec);
        vec.clear();
        dfsGenerate(numRows, res, currow + 1, vec);
    }

    //循环迭代法
    vector<vector<int>> lpGenerate(int numRows)
    {
        if(!numRows)
            return {};
        vector<vector<int>> res(numRows);
        for(int i = 0; i < numRows; i++)
            res[i].resize(i + 1);
        res[0][0] = 1;
        for(int i = 1; i < numRows; i++)
        {
            for(int j = 0; j < i + 1; j++)
            {
                if(j == 0)
                    res[i][j] = 1;
                else if(j == i)
                    res[i][j] = 1;
                else
                    res[i][j] = res[i - 1][j - 1] + res[i - 1][j];
            }
        }
        return res;
    }

    vector<vector<int>> XXX(int numRows) {
        // return lpGenerate(numRows);
        if(!numRows)
            return {};
        vector<vector<int>> res;
        vector<int> vec;
        res.push_back({1});
        dfsGenerate(numRows, res, 1, vec);
        return res;
    }
};

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


