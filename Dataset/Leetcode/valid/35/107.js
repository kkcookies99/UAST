 var XXX = function(nums, target) {
    function dfs(l, r) {
        if (l > r) return l;
        const mid = Math.floor((l+r)/2);
        if (nums[mid] < target) {
            return dfs(mid + 1, r);
        } else if (nums[mid] > target) {
            return dfs(l, mid-1);
        }
        return mid;
    }
    return dfs(0, nums.length-1);
};

