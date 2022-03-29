 class Solution {
public:
    int XXX(vector<int>& height) {
        // 双指针
        int Area = 0;
        int i = 0, j = height.size()-1;
        // 数组两端开始缩小容器底的大小，保留容器壁高的那一端，直到没有底
        while(i < j){
            int m = min(height[i], height[j]);
            Area = max(Area, m*(j-i));
            if(height[i] < height[j])
                i++;
            else
                j--;
        }
        return Area;       
    }
};

