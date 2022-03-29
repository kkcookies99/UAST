class Solution {
public:
    int XXX(vector<int>& height) {
        int res = 0;
        int left=0, right=height.size()-1;

        while (left < right) {
            if (height[left] <= height[right]) {
                if ((height[left]*(right-left)) > res)
                    res = height[left] * (right - left);
                left++;
            }
            else {
                if ((height[right]*(right-left)) > res)
                    res = height[right] * (right - left);
                right--;
            }
        }

        return res;
    }
};

