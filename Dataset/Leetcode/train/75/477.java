 public void XXX(int[] nums) {

    if (nums.length <= 1) {
      return;
    }

    // [0, ..., lessThanPointer] is value = 0
    int lessThanPointer = -1;

    // [lessThanPointer +1, ... , cursor -1] is value = 1;
    int cursor = 0;
    // [greatThanPointer, ...., nums.length -1] is value = 2;
    int greatThanPointer = nums.length;

    while (cursor < greatThanPointer) {

      if (nums[cursor] == 0) {
        lessThanPointer++;
        swap(nums, lessThanPointer, cursor);
        cursor++;
      } else if (nums[cursor] == 1) {
        cursor++;
      } else {
        greatThanPointer--;
        swap(nums, cursor, greatThanPointer);
      }
    }
  }

  private void swap(int[] nums, int p, int q) {
    int temp = nums[p];
    nums[p] = nums[q];
    nums[q] = temp;
  }

