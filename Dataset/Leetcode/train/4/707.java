 class Solution {
    public double XXX(int[] nums1, int[] nums2) {
        double ans = 0.0;
        if(nums1.length==0&&nums2.length==0) return ans;
        int[] arr = new int[nums1.length+nums2.length];
        for(int i=0;i<nums1.length;i++){
            arr[i]=nums1[i];
        }
        for(int i=nums1.length;i<nums1.length+nums2.length;i++){
            arr[i]=nums2[i-nums1.length];
        }
        Arrays.sort(arr);
        if(arr.length%2!=0) ans=1.0*arr[arr.length/2];
        else ans=1.0*(arr[arr.length/2]+arr[arr.length/2-1])*0.5;
        return ans;
    }
}

