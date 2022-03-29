 class Solution {
    public double XXX(int[] nums1, int[] nums2) {
        int l1=nums1.length,l2=nums2.length,length=(l1+l2)/2+1,i=0,j=0,k=0;
        int[] ints=new int[length];
        while (k!=length){//时间复杂度O（n+m/2）
            if (i==l1) {
                ints[k++]=nums2[j++];continue;
            }
            if (j==l2) {
                ints[k++]=nums1[i++];continue;
            }
            if (nums1[i]<nums2[j]){
                ints[k++]=nums1[i++];
            }else {
                ints[k++]=nums2[j++];
            }
        }
        return (l1+l2)%2==0?(ints[length-1]+ints[length-2])/2.0:ints[length-1];
    }
}

