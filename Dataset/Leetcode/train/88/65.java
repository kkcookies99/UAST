 public void XXX(int[] nums1, int m, int[] nums2, int n) {
        int index=m+n-1;
        int i=m-1,j=n-1;
        while(index>=0 && i>=0 && j>=0){
            if(nums1[i]>nums2[j]){
                nums1[index]=nums1[i];
                i--;
            }
            else{
                nums1[index]=nums2[j];
                j--;
            }
            index--;
        }
        while(i>=0){
            nums1[index--]=nums1[i--];
        }
        while(j>=0) nums1[index--]=nums2[j--];
    }

