 class Solution {
public:
    vector<vector<int>> XXX(int numRows) {
        vector<vector<int>> ans;
        ans.emplace_back(vector<int>{1});

        //第一、二行单独处理返回答案
        if(numRows==1)
            return ans;
        ans.emplace_back(vector<int>{1,1});
        if(numRows==2)
            return ans;

        for(int i=2;i<numRows;++i)
        {//增加新行
            vector<int> newRow(i+1,-1);
            newRow[0]=1;newRow[i]=1;
            int j;
            for(j=1;j<(i>>1);++j)
            {//每行只算i/2之前的数，第i/2个数在循环之后判断行数的奇偶再考虑是否需要进行对称复制
                newRow[j]=ans[i-1][j-1]+ans[i-1][j];
                newRow[i-j]=newRow[j];//每行是对称的
            }
            if(j==(i>>1))
            {
                newRow[j]=ans[i-1][j-1]+ans[i-1][j];//奇数行不需要考虑中间数的复制
                if(i%2!=0)//偶数行，newRow[i/2]需要复制到newRow[i/2+1],即：i和i-j
                    newRow[i-j]=newRow[j];
            }
            ans.emplace_back(newRow);
        }

        return ans;
    }
};

