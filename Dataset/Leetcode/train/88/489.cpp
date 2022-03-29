 class Solution {
public:
    void XXX(vector<int>& nums1, int m, vector<int>& nums2, int n) {
        int n1=nums1.size()-1;
        while(m>0 && n>0){
            nums1[n1--]=nums1[m-1]>nums2[n-1]?nums1[--m]:nums2[--n];
        }
        while(n>0){
            nums1[n1--]=nums2[--n];
        }
    }
};

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


