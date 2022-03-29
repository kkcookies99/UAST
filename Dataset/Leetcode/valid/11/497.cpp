 class Solution {
public:
    int XXX(vector<int>& height) {
        int num = height.size();
        int i =0,j = num-1;
        int ans = min(height[i],height[j])*(j-i) ;
        while(i<j){
            if(height[i]<=height[j]){
            ans = max(ans,height[i]*(j-i));
            i++;
        }else{
            ans = max(ans,height[j]*(j-i));
            j--;
        }
        }
        return ans;
    }
};

