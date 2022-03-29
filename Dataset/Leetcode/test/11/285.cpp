class Solution {
public:
    int XXX(vector<int>& height) {
        
        int n=height.size();
        int r=n-1;
        int l=0;
        int ret=0;
        while(l<r){
            ret=max(ret,min(height[l],height[r])*(r-l));
            if(height[l]<height[r])
            l++;
            else
            r--;

        }
        return ret;
    }
};

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }

