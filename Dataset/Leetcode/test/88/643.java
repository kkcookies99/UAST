 class Solution {
    public void XXX(int[] nums1, int m, int[] nums2, int n) {
        int k = nums1.length-1;
        int i = m-1,j = n-1;
        while(k >=0){
            int num1 = i>=0?nums1[i]:Integer.MIN_VALUE;
            int num2 = j>=0?nums2[j]:Integer.MIN_VALUE;
            nums1[k] = Math.max(num1,num2);
            if(num1 > num2){i--;}
            else{j--;}
            k--;
        }
    }
}

