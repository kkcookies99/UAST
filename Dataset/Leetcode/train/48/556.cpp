 class Solution {
public:
    void XXX(vector<vector<int>>& matrix) {
        //i,j -->j,n-i-1
        //n-1-j,i -->i,j
        int n=matrix.size();
        int l=0,r=n-1;
        while (l < r)
        {
            for (int i = l; i < r; ++i)
            {
                int p=l,q=i;
                int temp = matrix[p][q];
                for(int j=0;j<3;++j)
                {
                    matrix[p][q]=matrix[n-1-q][p];
                    int t=p;
                    p=n-1-q;
                    q=t;
                }
                matrix[p][q] = temp;
            }
            l++;
            r--;
        }
    }
};

