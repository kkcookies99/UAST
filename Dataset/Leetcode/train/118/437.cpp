 class Solution {
public:
    vector<vector<int>> XXX(int numRows) {
        vector<vector<int>> res;
        int i,j;
        for(i=0;i<numRows;i++){
            vector<int> temp(i+1,1);
            if(i<2) res.push_back(temp);//前两行全是1
            else{
                for(j=1;j<temp.size()-1;j++){
                   temp[j]=res[i-1][j-1]+res[i-1][j];//这一行等于上一行相邻两个数之和
                }
                res.push_back(temp);
            }
        }
        return res;
    }
};

