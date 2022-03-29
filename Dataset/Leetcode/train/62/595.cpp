class Solution {
public:
    int XXX(int m, int n) {
        vector<vector<int>> nums(m,vector<int>(n));
        for(int i=0;i<nums.size();i++)
        {
            nums[i][0] = 1;
        }
        for(int j=0;j<nums[0].size();j++)
        {
            nums[0][j] = 1;
        }
        for(int i=0;i<nums.size()-1;i++)
        {
            for(int j=0;j<nums[0].size()-1;j++)
            {
                
                nums[i+1][j+1] = nums[i+1][j] + nums[i][j+1];
                
            }
        }
        return nums[m-1][n-1];
    }
};

