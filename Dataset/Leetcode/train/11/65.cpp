class Solution {
public:
    int XXX(vector<int>& height) {
        int left = 0, right = height.size() - 1, max_area=0;
        while(left <= right)
        {
            int total = (height.at(left) < height.at(right) ? height.at(left): height.at(right)) * (right - left);
            if(height.at(left) < height.at(right)) left++;
            else right--;
            max_area = max_area > total ? max_area : total;
        }
        return max_area;
    }
};

