 class Solution {
public:
    void XXX(vector<vector<int>>& matrix) {
        int n=matrix.size();
        int c=0;
        for(int j=n;j>=2;j-=2)
        {
            
        for(int i=0;i<=j-2;i++) 
        {
            int temp1,temp2,temp3,temp4;
            temp1=matrix[c][i+c];
            temp2=matrix[i+c][n-1-c];
            temp3=matrix[n-1-c][n-1-c-i];
            temp4=matrix[n-1-i-c][c];
            matrix[c][i+c]=temp4;
            matrix[i+c][n-1-c]=temp1;
            matrix[n-1-c][n-1-c-i]=temp2;
            matrix[n-1-c-i][c]=temp3;
        }
        c++;
        }
    }
};

