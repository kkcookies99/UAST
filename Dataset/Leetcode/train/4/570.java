 class Solution {
    public double XXX(int[] nums1, int[] nums2) {
        int[] sum = Arrays.copyOf(nums1,nums1.length+nums2.length);
        System.arraycopy(nums2, 0, sum, nums1.length, nums2.length);
        Arrays.sort(sum);
        if(sum.length%2==0){
            return (sum[sum.length/2-1]+sum[sum.length/2])/2.0;
        }else{
            return sum[(int)sum.length/2];
        }
    }
}

