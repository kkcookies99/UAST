 class Solution {
     public static double XXX(int[] nums1, int[] nums2) {
        if(nums1.length < 2 && nums2.length < 2){
            if(nums1.length == 0){
                return (float) nums2[0];
            }else if(nums2.length == 0){
                return (float) nums1[0];
            }
            return (float)(nums1[0]+nums2[0]) / 2;
        }
        int[] result = Arrays.copyOf(nums1,nums1.length+nums2.length);
        System.arraycopy(nums2,0,result,nums1.length,nums2.length);
        Arrays.sort(result);
        int realLength = result.length;
        int len = result.length & 1;
        if(len == 0){
            int mid = realLength >> 1;
            return ((float)(result[mid]+result[mid-1]) / 2);
        }else{
            return (float) result[(realLength-1) >> 1];
        }
    }



}

