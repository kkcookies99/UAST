 class Solution {
    public void XXX(int[] nums1, int m, int[] nums2, int n) {
        int index = m + n;
        while(m > 0 && n > 0){
            nums1[--index] = nums1[m-1] > nums2[n-1] ? nums1[--m] : nums2[--n];
        }
        while(m > 0){
            nums1[--index] = nums1[--m];
        }
        while(n > 0){
            nums1[--index] = nums2[--n];
        }
    }
}

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


