   public void XXX(int[] nums) {
//indnx为遍历的序号，从头开始 L 为最左的指针指向0，R为右边指针指向2
        int L = -1, R = nums.length,index = 0;
        while(index < R){
            if(nums[index] < 1){
遍历的数小于左指针交换，indnx继续走
                swap(nums, ++L, index++);
//indnx 大于1与右指针交换，index不走以为不知道交换过来的是0还是1
            } else if(nums[index] > 1){
                swap(nums, --R, index);
            } else {
相等时index走
                index++;
            }
        }
    }
    
    public void swap(int[] arr, int i, int j){
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }
code block

