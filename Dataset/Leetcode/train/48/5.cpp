class Solution {
public:
    void XXX(vector<vector<int>>& matrix) {
int n=matrix.size();
if(n==1)return;
for(int i=0;i<n-1-i;i++){
  for(int j=i;j<n-1-i;j++){
      swap(matrix[i][j],matrix[j][n-1-i]);
      swap(matrix[i][j],matrix[n-1-i][n-1-j]);
      swap(matrix[i][j],matrix[n-1-j][i]);
  }}}};

