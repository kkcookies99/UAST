var XXX = function(nums) {
const length = nums.length;
            if (length === 1) {
                return true;
            }
            const memo = Array(length).fill(0);
            memo[length - 1] = 1;

            function jump(position) {
                if (memo[position] === 1) {
                    return true;
                } else if (memo[position] === -1) {
                    return false;
                }

                const maxLength = Math.min(position + nums[position], length - 1);
                for (let i = position + 1; i <= maxLength; i++) {
                    let jumpResult = jump(i);
                    if (jumpResult === true) {
                        memo[position] = 1;
                        return true;
                    }
                }
                memo[position] = -1;
                return false;

            }
            const result = jump(0);
            return result;
};

