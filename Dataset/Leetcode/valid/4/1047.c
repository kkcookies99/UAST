 double XXX(int* nums1, int nums1Size, int* nums2, int nums2Size){
    int len = nums1Size + nums2Size;
    int index1 = 0;
    int index2 = 0;
    int cur = 0;
    int pre = 0;
    for(int i = 0; i < len / 2 + 1; i++){
        pre = cur;
        if(nums1Size > index1 && nums2Size > index2){
            if(nums1[index1] > nums2[index2]) {
                cur = nums2[index2];
                index2++;
            } else {
                cur = nums1[index1];
                index1++;
            }
        } else if(nums1Size > index1){
            cur = nums1[index1];
            index1++;
        } else {
            cur = nums2[index2];
            index2++;
        }
    }
    if(len % 2 == 0){
        return (pre + cur)/2.0;
    } else {
        return cur;
    }
}

