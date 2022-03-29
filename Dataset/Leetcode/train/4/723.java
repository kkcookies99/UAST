 class Solution {
    public double XXX(int[] nums1, int[] nums2) {
        int[] nums = new int[nums1.length + nums2.length]; 
        int t = 0;
        int t1 = 0;
        int t2 = 0;
        while(t1 < nums1.length && t2 < nums2.length){
            if(nums1[t1] > nums2[t2]){
                nums[t] = nums2[t2];
                t2++;
            } else{
                nums[t] = nums1[t1];
                t1++;
            }
            t++;
        }
        while(t1 < nums1.length){
            nums[t] = nums1[t1];
            t1++;
            t++;
        }
        while(t2 < nums2.length){
            nums[t] = nums2[t2];
            t2++;
            t++;
        }
        t--;
        double result;
        if(t % 2 != 0){
            result = ((double)nums[t/2] + (double)nums[t/2+1]) /2;
        }else{
            result = nums[t/2];
        }
        return result;
    }
}

