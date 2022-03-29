class Solution {
public:
    int XXX(vector<int>& height) {
    if(height.size()<= 1)
        return 0;
    int max_area = 0;
    for(int i = 0; i < height.size()-1; ++i){
        for(int j = i+1; j < height.size(); ++j){
            int area = (j-i)*min(height[i],height[j]);
            max_area = max(max_area,area);
        }
    }
    return max_area;    
    }
};

