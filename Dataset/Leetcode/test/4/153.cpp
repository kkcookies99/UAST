 class Solution {
public:
    double XXX(vector<int>& nums1, vector<int>& nums2) {
        vector<int> a;
        for (int i = 0; i < nums1.size(); ++i) a.push_back(nums1[i]);
        for (int i = 0; i < nums2.size(); ++i) a.push_back(nums2[i]);
        sort(a.begin(), a.end());
        if (a.size() & 1) return a[a.size() / 2];
        return double((a[a.size() / 2] + a[a.size() / 2 - 1])) / 2;
    }
};

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }

