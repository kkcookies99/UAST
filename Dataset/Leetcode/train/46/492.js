 var XXX = function(nums) {
    var results = []
    var result = []
    var level = 0
    helper(results, result, level, nums)
    return results
};
function helper(results, result, level, nums) {
    if (level === nums.length) {
        return results.push(result)
    }
    // proces
    // drill drown
    for (let i = 0; i < nums.length; i++) {
        if (result.indexOf(nums[i]) != -1){
            continue
        }
        let temp = result.slice(0)
        temp.push(nums[i])
        helper(results, temp, level+1, nums)
    }
}

