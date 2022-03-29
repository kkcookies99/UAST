 class Solution {
public:
    void XXX(vector<vector<int>>& matrix) {
        int n = matrix.size(), begin = 0, temp, end = n - 1;
        while(n > 1){
            for(int i = begin; i < end; i++){
                temp = matrix[begin][i];
                matrix[begin][i] = matrix[end - i +begin][begin];
                matrix[end - i + begin][begin] = matrix[end][end - i + begin];
                matrix[end][end- i + begin] = matrix[i][end];
                matrix[i][end] = temp;
            }
            begin++;
            n = n - 2;
            end--;
        }
    }
};

