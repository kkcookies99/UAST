class Solution {
public:



    void XXX(vector<vector<int>>& matrix) {
        int times = (matrix.size()+1)/2;
         for(int i = 0; i<times; i++)
         {
             //这里减去因为边上的已经算上了  
            for(int j = i; j< matrix.size()-1-i; j++)
            {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[matrix.size()-1-j][i];
                int temp2 = matrix[j][matrix.size()-1-i];
                matrix[j][matrix.size()-1-i] = temp;
                 temp = matrix[matrix.size()-1-i][matrix.size()-1-j];
                matrix[matrix.size()-1-i][matrix.size()-1-j] = temp2;
                matrix[matrix.size()-1-j][i] = temp;


            }
        }

        
    }
};

