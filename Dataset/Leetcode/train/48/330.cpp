class Solution {
public:
    void XXX(vector<vector<int>>& matrix) {
        int n=matrix.size();
        for(int i=0;i<n/2;i++){
            for(int j=i;j<n-i-1;j++){
                int temp=0;
                for(int k=0;k<3;k++){
                    if(k==0){
                        temp=matrix[j][n-i-1];
                        matrix[j][n-i-1]=matrix[i][j];
                        matrix[i][j]=temp;
                    }
                    else if(k==1){
                        temp=matrix[n-i-1][n-j-1];
                        matrix[n-i-1][n-j-1]=matrix[i][j];
                        matrix[i][j]=temp;
                    }
                    else if(k==2){
                        temp=matrix[n-j-1][i];
                        matrix[n-j-1][i]=matrix[i][j];
                        matrix[i][j]=temp;
                    }
                }
            }
        }
    }
};j

