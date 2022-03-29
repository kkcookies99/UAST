 class Solution {
public:
    vector<vector<int>> XXX(int numRows) {
     vector<vector<int> > yh;
     vector<int>  y;
     y.push_back(1);
     yh.push_back(y);
     for(int i=1;i<numRows;i++)
     {  y.clear();
        y.push_back(1);
         for(int j=1;j<i;j++)
         {
             if(j-1>=0) y.push_back(yh[i-1][j-1]+yh[i-1][j]);
         }
        y.push_back(1);
        yh.push_back(y);
     }
     return yh;
    }
};

