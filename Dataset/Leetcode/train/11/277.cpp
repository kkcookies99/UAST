class Solution {
public:
    int XXX(vector<int>& height) {
        int h = 1, s = height.size(), res = 0, maxHeight = 0;
        int i1 = 0, i2 = s - 1;//store the first and the last index
        for(int j = 0; j < s; j++) {
            if(height[j] > maxHeight) {
                maxHeight = height[j];
            }
        }
        while(h <= maxHeight) {
            while(height[i1] < h) {
                i1++;
            }
            while(height[i2] < h) {
                i2--;
            }
            int water = (i2 - i1) * h;
            if(water > res) {
                res = water;
            }
            h++;
        }
        return res;
    }
};

