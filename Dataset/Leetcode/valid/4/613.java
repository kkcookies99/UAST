 class Solution {
    public double XXX(int[] nums1, int[] nums2) {
        int nums1length = nums1.length;
        int nums2length = nums2.length;
        int[] newnums=Arrays.copyOf(nums1, nums1length+nums2length);//数组扩容
        System.arraycopy(nums2, 0, newnums, nums1length, nums2length);
        Arrays.sort(newnums);
        if(newnums.length%2==1){//奇数，取中间
        	return newnums[newnums.length/2];
        }
        double num1=newnums[newnums.length/2-1];
        double num2=newnums[newnums.length/2];
        return (num1+num2)/2;
    }
}

