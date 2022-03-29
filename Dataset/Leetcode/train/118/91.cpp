 class Solution {
public:
    vector<vector<int>> XXX(int numRows) {
        //  vector<vector<int>> res(numRows);
        //  vector<int> column(numRows,0);
        //  vector<int> temp;
        //  column[0]=1;
        //  res[0].push_back(1);
        //  for(int i=1;i<numRows;i++){
        //      temp=column;
        //      for(int j=0;j<=i;j++){
        //          if(j==0||j==i){
        //              column[j]=1;
        //              res[i].push_back(1);
        //          }else{
        //              column[j]= temp[j-1]+temp[j];
        //              res[i].push_back(column[j]);
        //          }
        //      }
        //  }
        //  return res;
         // 算法优化：
         vector<vector<int>> res(numRows);
         for(int i=0;i<numRows;i++){
             res[i].resize(i+1);
             res[i][0]=res[i][i]=1;
             for(int j=1;j<i;j++){
                 res[i][j] = res[i-1][j-1]+res[i-1][j];
             }
         }
         return res;
    }
};

