 int XXX(int* nums, int numsSize, int target){
    int low = 0, high = numsSize - 1;
    int mid;
    while (low <= high) {
        // mid = (low + high) / 2;
        mid = low + (high - low) / 2;
        if (*(nums + mid) == target) {
            return mid;
        }
        else if (*(nums + mid) < target) {
            low = mid + 1;
        }
        else {
            high = mid - 1;
        }
    }
    return low;
}

