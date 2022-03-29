     public void XXX(int[] nums) {
        int left = -1;
        int right = nums.length;
            for (int i = 0; i < nums.length; i++) {
                if (i < right) {
                    if (nums[i] > 1) {
                        swap(nums, i, --right);
                        i--;
                    } else if (nums[i] < 1) {
                        swap(nums, i, ++left);
                    }
                }
            }
    }
    public static void swap(int[] num , int a ,int b){
        int temp = num[a];
        num[a] = num[b];
        num[b] = temp;
    }

