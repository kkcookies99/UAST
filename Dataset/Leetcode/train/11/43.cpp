class Solution {
public:
    int XXX(vector<int>& height) {
        int n=height.size();
        int res=0;
        int i=0,j=n-1;
         while(i<j){
               res=max(res,min(height[i],height[j])*(j-i));
            if(height[j]>=height[i])
                i++;
            else
                j--;
          
         }
        return res;
    }
};

