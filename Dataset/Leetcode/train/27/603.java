 public int XXX(int[] nums, int val) {
        
        if (nums.length == 0)
            return 0;

        // 同步双指针
        int i=0,j=0;

        while (j<nums.length) {
            if (nums[j] == val) {   // 遇到了要删除的数，单指针溜达
                j++;
            } else {                // 不需要删除 则检测双指针位置是否一致
                if (i != j)         // 指针位置不一致，意味着需要做删除了
                    nums[i] = nums[j];
                i++;
                j++;
            }
        }
        return i;

    }

