 void XXX(int* nums1, int nums1Size, int m, int* nums2, int nums2Size, int n){
    for (int i = 0; i < nums2Size; ++i)
        nums1[m + i] = nums2[i];
    mysort(nums1, nums1Size, 0, m + n - 1);
}

int partition(int *arr, int n, int low, int high) {
    int i = low;
    int j = high;
    int tmp = arr[i];
    while (i < j) {
        while (i < j && arr[j] >= tmp) j--;
        if (i < j)  arr[i++] = arr[j];
        while (i < j && arr[i] < tmp)   i++;
        if (i < j) arr[j--] = arr[i];
    }
    arr[i] = tmp;
    return i;
}

void mysort(int *arr, int arrSize, int low, int high) {
    if (!arr || arrSize < 0)
        return;
    if (low < high) {
        int k = partition(arr, arrSize, low, high);
        mysort(arr, arrSize, low, k - 1);
        mysort(arr, arrSize, k + 1, high);
    }
}

