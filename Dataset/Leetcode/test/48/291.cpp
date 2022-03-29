class Solution {
public:
    void XXX(vector<vector<int>>& matrix) {
        int n=matrix.size();
        int count=0; 
        while(count<n/2){
            int line=count;
            for(int i=count;i<n-count-1;i++){
                int a=matrix[line][i];
                int b=matrix[i][n-line-1];
                int c=matrix[n-line-1][n-i-1];
                int d=matrix[n-i-1][line];
                matrix[i][n-line-1]=matrix[line][i];
                matrix[n-line-1][n-i-1]=b;
                matrix[n-i-1][line]=c;
                matrix[line][i]=d;
            }
            count++;
        }
    }
};

