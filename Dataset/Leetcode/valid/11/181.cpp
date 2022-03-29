class Solution {
public:
    int XXX(vector<int>& height) {
        int left=0;
        int right = height.size()-1;
        int res = 0;
        while(left<right){
            res = height[left]<height[right]?max(res, (right-left)*height[left++]):max(res, (right-left)*height[right--]);
        }
        return res;
    }
};

