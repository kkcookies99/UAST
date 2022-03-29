 class Solution {
public:
    int XXX(vector<int>& height) {
        int i=0,j=height.size()-1;
        int res=0;

        while(i<j){
            res=max(res,(j-i)*min(height[j],height[i]));
            if(height[i]<=height[j])
                i+=1;
            else
                j-=1;
        }
        return res;
    }
};

