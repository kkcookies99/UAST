 class Solution {
    public double XXX(int[] nums1, int[] nums2) {
        int len1=nums1.length,len2=nums2.length,len=(len1+len2)/2;
        int[] nums=new int[len1+len2];
        int index1=0,index2=0,index=0;
        while(index1<len1&&index2<len2&&index<=len)
            nums[index++]=nums1[index1]<nums2[index2]?nums1[index1++]:nums2[index2++];
        //Solution 1:
        if(index1!=len1)
            while(index1<len1)nums[index++]=nums1[index1++];
        if(index2!=len2)
            while(index2<len2)nums[index++]=nums2[index2++];
        if(index%2!=0)return nums[index/2];
        return ((double)(nums[index/2-1]+nums[index/2]))/2;
        //Solution 2:
        // if(index1==len1)while(index<=len)nums[index++]=nums2[index2++];
        // if(index2==len2)while(index<=len)nums[index++]=nums1[index1++];
        // if((len1+len2)%2!=0) return nums[len];
        // return ((double)(nums[len]+nums[len-1]))/2;
    }
}

