 class Solution {
    public double XXX(int[] nums1, int[] nums2) {
        int n = nums1.length + nums2.length;
        if (n % 2 == 0) {
            int m1 = findKthElement(nums1, nums2, 0, 0, n / 2 + 1);
            int m2 = findKthElement(nums1, nums2, 0, 0, n / 2);
            return (double) (m1 + m2) / 2.0;
        } else {
            return findKthElement(nums1, nums2, 0, 0, n / 2 + 1);
        }
    }
    
    
    // Find the kth smallest element in arr1[i1:m-1] and arr2[i2:n-1]
    // assume l1 < l2
    private int findKthElement(int arr1[], int arr2[], int i1, int i2, int k) {
        int l1 = arr1.length - i1, l2 = arr2.length - i2;
        if (l1 > l2) {
            return findKthElement(arr2, arr1, i2, i1, k);
        } else if (l1 <= 0) {
            return arr2[i2 + k - 1];
        } else if (k == 1) {
            return Math.min(arr1[i1], arr2[i2]);
        }
        
        int mid1 = k / 2 > l1 ? l1 : k / 2, mid2 = k - mid1;

        if (arr1[i1 + mid1 - 1] < arr2[i2 + mid2 - 1]) {
            return findKthElement(arr1, arr2, i1 + mid1, i2, k - mid1);
        } else if (arr1[i1 + mid1 - 1] == arr2[i2 + mid2 - 1]){
            return arr1[i1 + mid1 - 1];
        } else {
            return findKthElement(arr1, arr2, i1, i2 + mid2, k - mid2);
        }
        
    }
}


