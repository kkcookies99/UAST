var XXX = function(nums) {
    if (nums.length == 0) return []
    if (nums.length == 1) return [nums]
    var res = []

    function dfs(i) {
        if (i == nums.length) {
            console.log(nums)
            res.push(nums)
            return
        }
        for (var j = i; j < nums.length;j++) {
            var tmp = nums[i]
            nums[i] = nums[j]
            nums[j] = tmp
            dfs(i+1)
            var tmp = nums[i]
            nums[i] = nums[j]
            nums[j] = tmp
        }
    }
    dfs(0)
    return res

};

