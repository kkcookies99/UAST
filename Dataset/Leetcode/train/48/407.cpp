 class Solution {
public:
    void XXX(vector<vector<int>>& matrix) {
        int n=matrix.size();
        int l=0,r=n-1;
        while(l<r) {
            for(int i=l;i<r;i++) {
                int tmp=matrix[l][i];
                matrix[l][i]=matrix[r-i+l][l];
                matrix[r-i+l][l]=matrix[r][r-i+l];
                matrix[r][r-i+l]=matrix[i][r];
                matrix[i][r]=tmp;
            }
            l++;
            r--;
        }
    }
};

