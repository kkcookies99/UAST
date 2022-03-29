 class Solution {
public:
    int XXX(vector<int>& height) {
        int maxSize = 0;
        int i = 0, j = height.size()-1;
        while (i < j) {
            int size = std::min(height[i], height[j]) * (j-i);
            if (size > maxSize) {
                maxSize = size;
            }
            if (height[i] <= height[j]) {
                i += 1;
            }
            else {
                j -= 1;
            }
        }
        return maxSize;
    }
};

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


