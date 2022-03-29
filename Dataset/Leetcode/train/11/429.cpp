 class Solution {
public:
    int XXX(vector<int>& height) {
        int max_value = 0;
        int l = 0, r = height.size() - 1;
        while(l < r){
            int temp = (r - l) * min(height[l] , height[r]);
            max_value = temp > max_value ? temp : max_value;
            height[l] > height[r] ? r-- : l++;
        }
        return max_value; 
    }
};

