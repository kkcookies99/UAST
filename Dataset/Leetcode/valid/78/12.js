var XXX = function(nums) {
    let result = []
    let path = []
    function backtracking(startIndex) {
        result.push(path.slice())
        for(let i = startIndex; i < nums.length; i++) {
            path.push(nums[i])
            backtracking(i + 1)
            path.pop()
        }
    }
    backtracking(0)
    return result
};

