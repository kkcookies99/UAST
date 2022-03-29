 class Solution {
    public void XXX(int[] nums1, int m, int[] nums2, int n) {
        int[] newN=new int[m+n];
        int i=0,j =0,k=0;
        
        //核心代码
        while(i<m&&j<n) newN[k++]=nums1[i]<=nums2[j]?nums1[i++]:nums2[j++];
        while(i<m) newN[k++]=nums1[i++];
        while(j<n) newN[k++]=nums2[j++];
        
        for(int z=0;z<nums1.length;z++) nums1[z]=newN[z]; 
    }
}

