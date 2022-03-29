 class Solution {
public:
    int XXX(vector<int>& height) {
        int max_value = 0;
        int h_size = height.size();
        vector<vector<int>> state(h_size, vector<int>(h_size, 0));
        for(int i = 0; i < h_size; i++)
            for(int j = i + 1; j < h_size; j++){
                int temp = (j - i) * std::min(height[j] , height[i]);
                state[i][j] = std::max(temp, state[i][j - 1]);
                if(max_value < state[i][j])
                    max_value = state[i][j];
            }
        return max_value; 
    }
};

