 class Solution {
    public double XXX(int[] nums1, int[] nums2) {
        int len1=nums1.length,len2=nums2.length;
        double r1=binaryfind(nums1,0,len1-1,nums2,0,len2-1,(len1+len2+1)/2);
        if((len1+len2)%2!=0) return r1;
        return (binaryfind(nums1,0,len1-1,nums2,0,len2-1,(len1+len2)/2+1)+r1)/2;
    }
    //nums1[k/2-1]前面有k/2-1个数，nums2同理，若nums1[k/2-1]<nums2[k/2-1],则最多有(k/2-1)*2个数
    //比nums1[k/2-1]小，因此nums1[k/2-1]不可能是第k小的数，因此一次二分包括nums1[k/2-1]在内可排除k/2个数
    public double binaryfind(int[] nums1,int s1,int e1,int[] nums2,int s2,int e2,int k){
        if(s1>e1) return nums2[s2+k-1];
        if(s2>e2) return nums1[s1+k-1];
        if(k==1) return Math.min(nums1[s1],nums2[s2]);
        int index=k/2-1,index1=Math.min(index+s1,e1),index2=Math.min(index+s2,e2);
        if(nums1[index1]<=nums2[index2]) 
            return binaryfind(nums1,index1+1,e1,nums2,s2,e2,k-(index1+1-s1));
        else return binaryfind(nums1,s1,e1,nums2,index2+1,e2,k-(index2+1-s2));
    }
}

