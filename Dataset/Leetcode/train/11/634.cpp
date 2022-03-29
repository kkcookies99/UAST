 class Solution {
public:
    int XXX(vector<int>& height) {
        int l=0,r=height.size()-1,ans=0;
        while (l<r){
            int sum=min(height[l],height[r])*(r-l);
            ans=max(ans,sum);
            if (height[l]<height[r])    l++;
            else r--;
        }
        return ans;
    }
};

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


