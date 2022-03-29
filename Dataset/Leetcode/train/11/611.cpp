 class Solution {
public:
    int XXX(vector<int>& height) {
        int left = 0, right = height.size() - 1;
        int tmp, max = 0;
        while (right > left) {
            if (height[right] > height[left]) {
                tmp = height[left] * (right - left);
                ++left;
            } else {
                tmp = height[right] * (right - left);
                --right;
            }
            max =  (max > tmp ? max : tmp);
        }
        return max;

    }
};```

