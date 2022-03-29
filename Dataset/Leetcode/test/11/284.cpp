class Solution {
public:
    int XXX(vector<int>& height) {
        int n=height.size();
        int l=0,r=n-1;
        int max=0,room;
        while(l<r)
        {
            if(height[l]<height[r])
            {
                room=height[l]*(r-l);
                l++;
            }
            else
            {
                room=height[r]*(r-l);
                r--;
            }
            max=max>room?max:room;
        }
        return max;
    }
};

