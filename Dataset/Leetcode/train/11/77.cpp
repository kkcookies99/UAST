class Solution {
public:
    int XXX(vector<int>& height) {
        /*双指针，往中心移*/
        int left = 0;
        int right = height.size()-1;

        int res = 0;
        while (left < right) {
            /*底边长*/
            int w = right-left;
            /*高，取决于短的竖边*/
            int h = min(height[left], height[right]);
            /*取大的面积*/
            res = max(res, w*h);
            /*移动较短的竖边以获得更大的面积*/
            if (height[left] < height[right]) left ++;
            else right --;
        }

        return res;
    }
};

