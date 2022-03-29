     public int XXX(int[] nums, int val) {
        int currentIndex = 0;
        int lastIndex = nums.length - 1;
        while (currentIndex <= lastIndex){
            if(nums[currentIndex] == val){
                int temp = nums[currentIndex];
                nums[currentIndex] = nums[lastIndex];
                nums[lastIndex] = temp;
                lastIndex--;
            }else {
                currentIndex++;
            }
        }
        return currentIndex;
    }

