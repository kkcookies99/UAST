var XXX = function(nums) {
    const results = []
    const len = nums.length
    const dfs = function(arr, set) {
        if (arr.length === len) {
            results.push([...arr])
            return
        }
        for(let i = 0; i < len; i++) {
            if (!set.has(i)) { // 不重复数字
                set.add(i)
                arr.push(nums[i])
                dfs(arr, set)
                arr.pop()
                set.delete(i)
            }
        }
    }
    dfs([], new Set())
    return results
};

