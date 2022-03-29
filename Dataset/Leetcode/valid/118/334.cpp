 class Solution {
public:
    vector<vector<int>> XXX(int numRows) {
        vector<vector<int>> vArr(numRows);//先确定数组开辟numRows行
        int i=0,j;
        for(int i=0;i<numRows;i++)
        {
            vArr[i].resize(i+1,0);//在确定数组每行开辟i+1个数
            vArr[i][0]=1;vArr[i][i]=1;
            j=1;
            while(j<i)
            {
                vArr[i][j]=vArr[i-1][j-1]+vArr[i-1][j];
                j++;
            }
        }
        return vArr;
    }
};

