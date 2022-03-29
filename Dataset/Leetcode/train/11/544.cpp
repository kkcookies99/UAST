 class Solution {
public:
    int XXX(vector<int>& height) {
        int size = height.size();
        if(size <= 1)
            return 0;
        int i = 0,j = size - 1;
        int max = j * std::min(height[i],height[j]);
        while(i < j)
        {
            if(height[i] <= height[j])
                i++;
            else j--;
            int tmp = (j-i) * std::min(height[i],height[j]);
            if(max < tmp)
                max = tmp;
        }
        return max;
    }
};```

