 class Solution {
public:
    int XXX(vector<int>& height) {
        int n = height.size();

        int left = 0, right = n - 1;
        int res = 0;

        while (left < right) {
            int hl = height[left], hr = height[right];
            if (hl < hr) {
                res = max(res, hl * (--n));
                ++left;
            } else {
                res = max(res, hr * (--n));
                --right;
            }
        }

        return res;

    }
};

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


