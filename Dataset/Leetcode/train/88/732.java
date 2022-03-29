 class Solution {
    public void XXX(int[] nums1, int m, int[] nums2, int n) {
        int[] temp=new int[m+n];
        for(int i=0;i<m;i++){
            temp[i]=nums1[i];
        }
        for(int i=0;i<n;i++){
            temp[i+m]=nums2[i];
        }
        Arrays.sort(temp);
        for(int i=0;i<m+n;i++){
            nums1[i]=temp[i];
        }
    }
}

