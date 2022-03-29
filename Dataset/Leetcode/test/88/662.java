 class Solution {
    public void XXX(int[] nums1, int m, int[] nums2, int n) {
        int[] move=new int[m+1];
        for(int i=1,j=0;i<m+1;i++){
            move[i]=move[i-1];
            while(j<n&&nums2[j]<nums1[i-1]){
                j++;
                move[i]++;
            }
        }
        for(int i=m;i<nums1.length;i++) nums1[i]=Integer.MIN_VALUE;
        for(int i=m-1;i>=0;i--){
            nums1[i+move[i+1]]=nums1[i];
            if(move[i+1]!=0) nums1[i]=Integer.MIN_VALUE;
        }
        for(int i=0,j=0;i<m+n&&j<n;i++){
            if(nums1[i]==Integer.MIN_VALUE) nums1[i]=nums2[j++];
        }
    }
}

