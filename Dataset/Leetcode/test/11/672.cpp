 class Solution {
public:
    int XXX(vector<int>& height) {
        int i=0,j=height.size()-1;
        int maxval=0;
        while(1){
            if(i>=j) break;
            while(height[i]<height[j]&&i<height.size()){
                maxval=max(maxval,(j-i)*min(height[i],height[j]));
                i++;
                if(i>=j) break;
            }
            while(height[i]>=height[j]&&j>=0){
                maxval=max(maxval,(j-i)*min(height[i],height[j]));
                j--;
                if(i>=j) break;
            }

        }

        return maxval;
    }
};

