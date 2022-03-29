class Solution {
public:
    void XXX(vector<vector<int>>& matrix) {
        int n=matrix.size();
        if(n%2==1){
            int m=ceil(n/2.0);
            for(int i=0;i<n/2;i++){
                for(int j=0;j<m;j++){
                    int k=matrix[n-1-j][i];
                    matrix[n-1-j][i]=matrix[n-1-i][n-1-j];
                    matrix[n-1-i][n-1-j]=matrix[j][n-1-i];
                    matrix[j][n-1-i]=matrix[i][j];
                    matrix[i][j]=k;
                }
            }
        }
        else
            for(int i=0;i<n/2;i++){
                for(int j=0;j<n/2;j++){
                    int k=matrix[n-1-j][i];
                    matrix[n-1-j][i]=matrix[n-1-i][n-1-j];
                    matrix[n-1-i][n-1-j]=matrix[j][n-1-i];
                    matrix[j][n-1-i]=matrix[i][j];
                    matrix[i][j]=k;
                }
            }
    }
};

