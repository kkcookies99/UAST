 class Solution {
    public void XXX(int[] nums1, int m, int[] nums2, int n) {
        int i=m+n-1;
        if (m == 1 && n == 0 || n == 0)  return;
	if (n == 1 && m == 0||m==0) {
            for(int h=0;h<n;h++){
                nums1[h] = nums2[h];
            }
		return;
	}
        for(;;i--){
            if(nums2[n-1]>=nums1[m-1]){
                nums1[i]=nums2[n-1];
                n--;
                if(n==0) break;
            } else{
                nums1[i]=nums1[m-1];
                // System.out.println(nums1[i]+"  "+nums1[m-1]);
                m--;
                if(m==0) break;
            }
        }
        i-=1;
        while(n>0){
            nums1[i]=nums2[n-1];
            i--;
            n--;
        }
    }
}


