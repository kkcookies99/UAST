 class Solution {
public:
    vector<vector<int>> XXX(int numRows) {
        // 暴力法可还行，哈哈
        vector<vector<int>> pascalTriangle;
        vector<int> eachData(1,1);
        pascalTriangle.push_back(eachData);
        if(numRows == 1)
            return pascalTriangle;
        for(int j = 2;j <= numRows;j ++)
        {
            eachData.push_back(1);
            eachData[0] = 1;
            eachData[j - 1] = 1;
            for( int i = 1; i < j - 1;i ++)
            {
            eachData[i] = pascalTriangle[j - 2][i - 1] +pascalTriangle[j - 2][i];
            }
            pascalTriangle.push_back(eachData);
        }
        return pascalTriangle;
    }
};

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


