    public boolean XXX(int[] nums) {
        if (nums.length == 1) {
            return true;
        }
        // 只循环到倒数第二个位置，如果到最后一个意味成功，直接返回true
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == 0) {
                boolean XXX = false;
                int pos = i - 1;
                // 如果为0，倒着判断前面是否有跨越0点的跳跃点
                while (pos >= 0) {
                    if (nums[pos] > i - pos) {
                        XXX = true;
                        break;
                    }
                    pos--;
                }
                // 倒着找到队首都没有找到跳跃点，返回失败
                if (!XXX) {
                    return false;
                }
            }
        }
        return true;
    }

