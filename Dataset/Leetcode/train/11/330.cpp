class Solution {
public:
    // time complexity O(n)
    // space complexity O(1)
    int XXX(vector<int>& height) {

        int max_area = 0, cur_area = 0; 
        auto left = height.begin(), right = height.end() - 1; 

        while (left < right)
        {
            cur_area = min(*left, *right) * distance(left, right); 
            max_area = max(max_area, cur_area); 
            if (*left <= *right)
                ++left;
            else
                --right; 
        }

        return max_area; 
    }
};

