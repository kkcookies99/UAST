 void XXX(int* nums1, int nums1Size, int m, int* nums2, int nums2Size, int n){
    if (n == 0) {
        return;
    }
    int len = nums1Size;
    while (n > 0) {
        if (m == 0 || *(nums2 + n - 1) >= *(nums1 + m - 1)) {
            *(nums1 + len - 1) = *(nums2 + n - 1);
            n--;
        } else {
            *(nums1 + len - 1) = *(nums1 + m - 1);
            m = m > 0 ? --m : 0;
        }
        len--;
    }
}

