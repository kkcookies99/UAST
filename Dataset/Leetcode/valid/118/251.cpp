 class Solution {
public:
    vector<vector<int>> XXX(int numRows) {
        vector<vector<int>> ans;
        vector<int> tmp={1};
        ans.push_back(tmp);
        for(int i=1;i<numRows;i++){
            tmp.clear();
            for(int j=0;j<i+1;j++){//第i行有i+1个数字
                if(j==0 || j==i){//首位和末尾都是1，
                    tmp.push_back(1);
                }
                else{//其余位置为上一行相邻俩数的和
                    tmp.push_back(ans[i-1][j-1]+ans[i-1][j]);
                }
            }
            ans.push_back(tmp);
        }
        return ans;
    }
};

