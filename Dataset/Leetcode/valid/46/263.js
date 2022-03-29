var XXX = function(nums) {
    let combinations = []
    let vis = new Array(nums.length).fill(false)
    const backtrack = (combination, index) => {
        if (index === nums.length) {
            combinations.push(combination.slice())
        }
        for (let i = 0; i < nums.length; i++) {
            if (vis[i]) {
                continue
            }
            combination.push(nums[i])
            vis[i] = true
            backtrack(combination, index + 1)
            vis[i] = false
            combination.pop()
        }
    }
    backtrack([], 0)
    return combinations
};

