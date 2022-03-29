 void XXX(int* nums, int numsSize){
    int p0 = 0, p1 = 0, p2 = 0;
    for (int i=0; i<numsSize; i++) {
        if (nums[i] == 0) {
            nums[p0++] = 0;
            if (p1 >= p0) nums[p1] = 1;
            p1++;
            if (p2 >= p1) nums[p2] = 2;
            p2++;
        } else if (nums[i] == 1) {
            nums[p1++] = 1;
            if (p2 >= p1) nums[p2] = 2;
            p2++;
        } else nums[p2++] = 2;
    }
}

