 class Solution {
    public double XXX(int[] nums1, int[] nums2) {
        int len1 = nums1.length, len2 = nums2.length;
        int[] arr = new int[nums1.length + nums2.length];
        for (int i = 0; i < len1; i++) {
            arr[i] = nums1[i];
        }
        int index = len1; 
        for (int i = 0; i < len2; i++) {
            arr[index++] = nums2[i];
        }
        Arrays.sort(arr);
        if ((arr.length - 1) % 2 == 0) {
            return arr[(arr.length - 1) / 2];
        } else {
            int flag = (arr.length - 1) / 2;
            return ((double)arr[flag] + (double)arr[flag + 1]) / 2;
        }
    }
}

