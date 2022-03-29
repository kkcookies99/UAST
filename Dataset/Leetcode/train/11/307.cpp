class Solution {
public:
    int XXX(vector<int>& height) {
        int res = 0;
        for(int i= 0, j= height.size()-1; i<j;) {
            res = max(res, min(height[i], height[j]) * (j-i));
            if(height[i] < height[j]) i++;
            else j--;
        }
        return res;
    }
};

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }

