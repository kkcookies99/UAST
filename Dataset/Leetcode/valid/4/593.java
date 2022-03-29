 class Solution {
    public double XXX(int[] nums1, int[] nums2) {
         int len = nums1.length+nums2.length;
        int[] num = new int[len];
        System.arraycopy(nums1,0,num,0,nums1.length);
        System.arraycopy(nums2,0,num,nums1.length,nums2.length);
        Arrays.sort(num);
        if(len%2!=0){
            return num[len/2]*1.0;
        }else{
            return (num[len/2]+num[len/2-1])/2.0;
        }

    }
    
}

