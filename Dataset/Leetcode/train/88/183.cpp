 class Solution {
public:
    void XXX(vector<int>& nums1, int m, vector<int>& nums2, int n) {
        int i=m-1,j=n-1,t=m+n-1;
        while(i>=0 && j>=0){
            if(nums1[i]>nums2[j]){
                nums1[t--]=nums1[i--];
            }else{
                nums1[t--]=nums2[j--];
            }
        }
        while(i>=0) nums1[t--]=nums1[i--];
        while(j>=0) nums1[t--]=nums2[j--];
    }
};

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


