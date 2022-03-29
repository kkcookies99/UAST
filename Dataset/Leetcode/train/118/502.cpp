 class Solution {
public:
    vector<vector<int>> XXX(int numRows) 
    {
            vector<vector<int>> tri;
            if (numRows == 0)
            return tri;
            tri.push_back({1});
            if (numRows == 1)
            {
                 return tri;
             }
            else //n>=2的情况
            {

                for (int i = 1; i < numRows; ++i) //第i行
                {
                    tri.push_back({1}); //行首元素为1
                    for (int j = 1; j < i; ++j)
                    {
                        tri[i].push_back(tri[i - 1][j - 1] + tri[i - 1][j]);
                    }
                    tri[i].push_back(1); //行尾元素为1
                }
            }
            return tri;
        }
};

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


