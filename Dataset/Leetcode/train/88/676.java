 class Solution {
    public void XXX(int[] nums1, int m, int[] nums2, int n) {
        // 逆向双指针法，原地覆盖
        int pointer1 = m-1, pointer2 = n-1, count = m+n-1;
        while(pointer1>=0&&pointer2>=0){
            if(nums1[pointer1]<=nums2[pointer2]){
                nums1[count] = nums2[pointer2];
                pointer2--;
            }else{
                nums1[count] = nums1[pointer1];
                pointer1--;
            }          
            count--;
        }
        if(pointer1<0){
            for(int i=0; i<pointer2+1; i++){
                nums1[i] = nums2[i];
            }
        }
    }
}

