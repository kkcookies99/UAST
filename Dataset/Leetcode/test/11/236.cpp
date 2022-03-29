class Solution {
public:
    int XXX(vector<int>& height) {
        int ans = 0, tmp = 0, h = 0;
        for(int l = 0, r = height.size()-1 ; l < r; ){
            h = min(height[l], height[r]);
            tmp = (r-l)*h;
            ans = max(ans, tmp);
            if(h == height[l]) l++;
            else r--;
        }
        return ans;
    }
};

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }

