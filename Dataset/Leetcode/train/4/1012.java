 class Solution {
    public double XXX(int[] nums1, int[] nums2) {
        int n = nums1.length;
        int m = nums2.length;
        int[] arr = new int[n+m];
        if(n == 0){
            if(m == 1) {return nums2[m-1];}
            return m % 2 == 0 ? (nums2[m/2] + nums2[m/2-1]) / 2.0 : nums2[m/2]; 
        }else if(m == 0){
            if(n == 1) {return nums1[n-1];}
            return n % 2 == 0 ? (nums1[n/2] + nums1[n/2-1]) / 2.0 : nums1[n/2];
        }
        int count = 0;
        for(int num : nums1){
            arr[count] = num;
            count++;
        }
        for(int num : nums2){
            arr[count] = num;
            count++;
        }
        Arrays.sort(arr);
        return arr.length % 2 == 0 ? (arr[arr.length/2] + arr[arr.length/2-1]) / 2.0 : arr[arr.length/2];
    }
}

