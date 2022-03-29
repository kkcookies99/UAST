 int comp(const void* a, const void* b) {
    int* a1 = (int*)a;
    int* a2 = (int*)b;
    if(*a1 > *a2) {
        return 1;
    } else if(*a1 < *a2) {
        return -1;
    } else {
        return 0;
    }
}
double XXX(int* nums1, int nums1Size, int* nums2, int nums2Size){
    int temp[2001] = {0};
    int i;
    for(i = 0; i < nums1Size; i++) {
        temp[i] = nums1[i];
    }
    int len = i;
    for(int i = 0; i < nums2Size; i++) {
        temp[len++] = nums2[i];
    }
    qsort(temp, len, sizeof(int), comp);
    if(len % 2 == 0) {
        return (double)(temp[len / 2] + temp[len / 2 - 1] ) / 2;
    } else {
        return (double)temp[len / 2];
    }
}