 class Solution {
    public double XXX(int[] nums1, int[] nums2) {
        int size = nums1.length+nums2.length;
        int [] all = new int [size];
        int n1 = 0;
        int n2 = 0;
        int index = 0;
        while(n1<nums1.length || n2<nums2.length){
            if(n1<nums1.length && n2<nums2.length){
                if(nums1[n1]<=nums2[n2]){
                    all[index++] = nums1[n1++];
                }else{
                    all[index++] = nums2[n2++];
                }
            }else if (n1==nums1.length && n2<nums2.length){
                all[index++] = nums2[n2++];
            }else{
                all[index++] = nums1[n1++];
            }
        }
        if(size%2 == 0){
            int mid = size/2;
            return ((double)all[mid-1]+(double)all[mid])/2;
        }else{
            return (double)all[size/2];
        }
    }
}

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }

