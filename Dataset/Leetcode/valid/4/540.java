 class Solution {
    public double XXX(int[] nums1, int[] nums2) {
        int m = nums1.length, n = nums2.length;
        if(m>n){//保证m<=n，保证i在m数组上，j在n数组上
            int[] array = nums1;
            nums1 = nums2;
            nums2 = array;
            int temp = m;
            m = n;
            n = temp;
        }
        
        int minI = 0, maxI = m;
        int midLen = (m+n+1)/2;
        
        while(minI<=maxI){
            int i = (minI + maxI)/2;
            int j = midLen - i;//保证从i-1,i分割，j-1,j分割之后左边的数目正好是一半
            
            if(i<maxI && nums2[j-1]>nums1[i]){
                minI = i + 1;
            }
            else if(i>minI && nums1[i-1]>nums2[j]){
                maxI = i -1;
            }
            else{
                int maxLeft = 0;
                if(i == 0){//判断两个数组是否越界
                    maxLeft = nums2[j-1];
                }
                else if(j==0){
                    maxLeft = nums1[i-1];
                }
                else{
                    maxLeft = Math.max(nums1[i-1], nums2[j-1]);
                }
                if((m+n)%2==1)
                    return (double)maxLeft;
                
                int minRight = 0;
                if(i==m){//判断两个数组是否越界
                    minRight = nums2[j];
                }
                else if(j==n){
                    minRight = nums1[i];
                }
                else {
                    minRight = Math.min(nums1[i], nums2[j]);
                }
                return (maxLeft + minRight)/2.0;
            }
        }
        return 0.0;
        
    }
}

