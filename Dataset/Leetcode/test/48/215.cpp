class Solution {
public:
    void XXX(vector<vector<int>>& matrix) {
        int n=matrix.size();
        if(n==0) return;
        int i=0;
        int m=n-1;
        int y=m;
        while(i<n/2){
            for(int j=i;j<y;j++){
                int tmp=matrix[i][j];
                matrix[i][j]=matrix[m-j][i];
                matrix[m-j][i]=matrix[m-i][m-j];
                matrix[m-i][m-j]=matrix[j][m-i];
                matrix[j][m-i]=tmp;
            }
            i++;
            y--;
        }
    }
};

