 class Solution {
    public void XXX(int[] nums1, int m, int[] nums2, int n) {
        int[] temp = new int[m+n];
        //双指针法
        int i = 0;
        int j = 0;
        int t = 0;
        while(i<m && j<n){
            if(nums1[i]<nums2[j]){
                temp[t] = nums1[i];
                t++;
                i++;
            }else{
                temp[t] = nums2[j];
                j++;
                t++;
            }
        }
        while(i<m){
            temp[t] = nums1[i];
            t++;
            i++;
        }
        while(j<n){
            temp[t] = nums2[j];
            t++;
            j++;
        }
        for(int k = 0;k<temp.length;k++){
            nums1[k] = temp[k];
        }
    }
}

