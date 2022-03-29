 class Solution {
public:
    void XXX(vector<vector<int>>& matrix) {
        if(matrix.empty() || matrix[0].empty())
            return;
        int ti=0, bi=matrix.size()-1;
        while(ti<bi){
            int i=0;
            while(i<bi-ti){
                int tmp=matrix[ti][ti+i];
                matrix[ti][ti+i] = matrix[bi-i][ti];
                matrix[bi-i][ti] = matrix[bi][bi-i];
                matrix[bi][bi-i] = matrix[ti+i][bi];
                matrix[ti+i][bi] = tmp;
                ++i;
            }
            ++ti;
            --bi;
        }
    }
};

