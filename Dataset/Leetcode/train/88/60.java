 class Solution {
    public void XXX(int[] nums1, int m, int[] nums2, int n) {
        int j = m-1, k = n-1;
        for(int i=m+n-1; i>=0; i--){
            if(j == -1){
                nums1[i] = nums2[k];
                k--;
            }
            else if(k == -1){
                nums1[i] = nums1[j];
                j--;
            }
            else if(nums1[j] >= nums2[k]){
                nums1[i] = nums1[j];
                j--;
            }
            else{
                nums1[i] = nums2[k];
                k--;
            }
        }
    }
}

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


