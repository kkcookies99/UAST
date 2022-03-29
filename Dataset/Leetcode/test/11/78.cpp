class Solution {
public:
    int XXX(vector<int>& height) {
        int left = 0;
        int right = height.size() - 1;
        int S = (right - left) * min(height[left], height[right]);
        int temp;
        while(left < right){
            if (height[left] < height[right]){
                left++;
            }else {
                right--;
            }
            temp = (right - left) * min(height[left], height[right]);
            if (temp > S) S = temp;
        }
        return S;
    }
};

