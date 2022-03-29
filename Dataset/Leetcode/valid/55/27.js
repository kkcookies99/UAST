var XXX = function(nums) {
    const length = nums.length;
            if (length === 1) {
                return true;
            }
            let good = length - 1;
            for (let i = length - 2; i >= 0; i--) {
                if (i + nums[i] >= good) {
                    good = i;
                }
            }
            if (good === 0) {
                return true;
            } else {
                return false;
            }
};

