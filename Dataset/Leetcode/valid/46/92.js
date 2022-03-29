var XXX = function(nums) {
    let subs = []
    dfs(nums, subs, [])
    return subs
};

var dfs = (nums, subs, sub) => {
    if (sub.length === nums.length) {
        subs.push([...sub])
        return
    }
    for (let i = 0; i < nums.length; i ++) {
        if (!sub.includes(nums[i])) {
            sub.push(nums[i])
            dfs(nums, subs, sub)
            sub.pop()
        }
    }
}

