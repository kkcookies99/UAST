 class Solution {
    public void XXX(int[] nums1, int m, int[] nums2, int n) {
        if(m==0){
            int x =m;
            for(int a : nums2){
                nums1[x]=a;
                x++;
            }
        }
        if(m!=0&&n!=0){
            int j =m;
            for(int i =0;i<n;i++){
                nums1[j]=nums2[i];
                j++;
            }
            while(m>0){
                int y=n;
                while(y>0){
                    if(nums1[m-1]>nums1[m+y-1]){
                        int temp = nums1[m+y-1];
                       nums1[m+y-1]=nums1[m-1];
                        nums1[m-1]=temp;
                    }
                    y--;
                }
                m--;
                n++;
            }
        }
    }
}

