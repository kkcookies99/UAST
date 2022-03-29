 class Solution {
public:
    vector<vector<int>> XXX(int numRows) {
        vector<vector<int>> nums;
        for(int i = 0; i< numRows; i++)
        {
            vector<int> rowI(i + 1, 1);
            for(int j = 0; j <= i; j++)
            {
                if(j > 0 && j < i)
                {
                    rowI[j] = nums[i - 1][j - 1] + nums[i - 1][j];
                }
            }
            nums.push_back(rowI);
        }
        return nums;
    }
};

