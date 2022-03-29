 class Solution {
    public void XXX(int[] nums1, int m, int[] nums2, int n) {
        if(n!=0){
            if(m==0){
                int post=0;
                for(int temp:nums2)
                    nums1[post++]=temp;
            }else{
                while(n>0){
                    if(m==0||nums2[n-1]>=nums1[m-1]){
                        nums1[m+n-1]=nums2[n-1];
                        n--;
                    }else{
                        nums1[m+n-1]=nums1[m-1];
                        m--;
                    }
                }
            }
        }
    }
}

