 int XXX(int* nums, int numsSize){
    int num = *nums, count = 1; 
    for (int* p = nums; p != nums + numsSize; p++) {
        if (*p != num) { 
            num = *p;
            *(nums+count) = num;
            count++;
        }
    }
    return count; 
}

