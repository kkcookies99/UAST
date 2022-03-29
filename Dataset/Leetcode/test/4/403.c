 double XXX(int* nums1, int nums1Size, int* nums2, int nums2Size) {
    int num = 0, prev = 0;
    int p = 0, q = 0;
    int n1, n2;
    double res;
    
    for (int i = 0; i <= (nums1Size + nums2Size) / 2; i++) {
        prev = num;

        n1 = p < nums1Size ? nums1[p] : INT_MAX;
        n2 = q < nums2Size ? nums2[q] : INT_MAX;
        num = n1 < n2 ? (p++, n1) : (q++, n2);
    }
    
    if ((nums1Size + nums2Size) & 0x1) {
        res = num;
    } else {
        res = (prev + num) / 2.0;
    }
    
    return res;
}