 class Solution {
public:
    double XXX(vector<int>& nums1, vector<int>& nums2) {
        vector<int> mergedVec;
        mergedVec.insert(mergedVec.end(), nums1.begin(), nums1.end());
        mergedVec.insert(mergedVec.end(), nums2.begin(), nums2.end());
        sort(mergedVec.begin(), mergedVec.end());
        double ans = 0.00000;
        int len = mergedVec.size();
        if(len == 1) {
            return mergedVec[0] * 1.00000;
        }
        if(len == 0) {
            return ans;
        }
        if(len % 2 == 0) {
            ans = mergedVec[len / 2 - 1] + mergedVec[len / 2];
            ans /= 2;
        } else {
            ans = mergedVec[len / 2];
        }
        ans = ans * 1.00000;
        return ans;
    }
};

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }

