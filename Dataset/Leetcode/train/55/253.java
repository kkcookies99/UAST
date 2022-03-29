public boolean XXX(int[] nums) {
        int n = nums.length - 1;
        if (nums[0] >= n) {
            return true;
        }

        int max = nums[0]; //定义当前可以走到的最大位置
        //从1往后，判断每个位置是否可以走到
        for (int i = 1; i < nums.length; i++) {
            //如果当前位置可以走到，
            if (i <= max) {
                //判断当前位置能否到达终点
                if (i + nums[i] >= n) {
                    return true;
                }
                //如果不能，则更新从当前位置可以走到的最大节点，注意nums[i]+i,表示从i可以走到的最远距离
                max = Math.max(max, nums[i] + i);
            }
        }

        return false;
    }

