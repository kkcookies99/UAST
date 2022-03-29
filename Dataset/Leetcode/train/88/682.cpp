 class Solution {
public:
    void XXX(vector<int>& nums1, int m, vector<int>& nums2, int n) {
        for(int i=m;i<m+n;i++){
            nums1[i]=nums2[i-m];
        }
        sort(nums1.begin(),nums1.begin()+m+n);

    }
};

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


