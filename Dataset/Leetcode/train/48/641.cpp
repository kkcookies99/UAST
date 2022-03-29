 class Solution {
public:
    void XXX(vector<vector<int>>& matrix) {
        int swap;
        for(int i = 0; i < matrix.size(); i++){
            for(int j = matrix.size()-1; j >= 0; j--){
                swap = matrix[j][0];
                matrix[j].erase(matrix[j].cbegin());
                matrix[i].push_back(swap);
            }
        }  
    }
};

