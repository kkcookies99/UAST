 class Solution {
public:
    void XXX(vector<vector<int>>& matrix) {
        int n = matrix.size();
        for(int i = 0; i<n; i++)
            for(int j = 0; j<i; j++)
                swap(matrix[i][j], matrix[j][i]);
        for(int i = 0; i<n; i++){
            int pl = -1, pr = n;
            while(++pl < --pr)
                swap(matrix[i][pl], matrix[i][pr]);
        }
    }
};

