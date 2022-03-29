 int XXX(int* nums, int numsSize, int val){
    int slow = 0;
    for(int fast = 0; fast < numsSize; fast++) {
        //若快指针位置的元素不等于要删除的元素
        if(nums[fast] != val) {
            //将其挪到慢指针指向的位置，慢指针+1
            nums[slow++] = nums[fast];
        } 
    }
    //最后慢指针的大小就是新的数组的大小
    return slow;
}

