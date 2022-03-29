 class Solution {
    public double XXX(int[] nums1, int[] nums2) {
     int len1 = nums1.length;
        int len2 = nums2.length;
        int[] arr = new int[len1+len2];
        int index = 0;
        int l1 = 0;//指向nums1的指针
        int l2 = 0;//指向nums2的指针
        while(l1<len1 && l2<len2){
            if(nums1[l1]<nums2[l2]){
                arr[index]=nums1[l1];
                l1++;
            }else if (nums1[l1]>=nums2[l2]){
                arr[index]=nums2[l2];
                l2++;
            }
            index++;
        }
        while(l1<len1){
            arr[index] = nums1[l1];
            index++;
            l1++;
        }
        while(l2<len2){
            arr[index] = nums2[l2];
            l2++;
            index++;
        }
        int len = arr.length;
        double avage = 0;
        if(len%2==0){
            int i1 = len/2;
            int i2 = len/2-1;
             avage = (arr[i1]+arr[i2])/2.0;
        }else{
            int i = len/2;
             avage = arr[i]/1.0;
        }
        return avage;
    }
}

