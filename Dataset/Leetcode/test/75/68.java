public void XXX(int[] nums) {
        Arrays.sort(nums);
}

public void XXX(int[] nums) {
        for (int i = 0; i < nums.length-1; i++) {
            // 冒泡，每次循环将剩余最小值移到当前i处
            for (int j = i+1; j < nums.length; j++) {
                if (nums[i] > nums[j]) {
                    int temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                }
            }
        }
}

public void XXX(int[] nums) {
        // 首尾指针
        int start = 0;
        int end = nums.length - 1;
        // 超过end都是2
        for (int i = 0; i <= end;) {
            if (nums[i] == 0) {
                int temp = nums[i];
                nums[i] = nums[start];
                nums[start] = temp;
                start++;
                // 交换后的nums[i]必不可能为2，为0或为1时，i之前元素必为0，所以可以不考虑num[i]，i+1
                i++;
            } else if (nums[i] == 2) {
                int temp = nums[i];
                nums[i] = nums[end];
                nums[end] = temp;
                end--;
                // 交换后的nums[i]可能为0或2，需要再次交换，所以不能i+1;
                // i++;
            } else { // 此时nums[i]=1,i+1
                i++;
            }
        }
}

