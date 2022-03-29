 var XXX = function(nums) {
    result = new Set()
    for (var i = 0; i < nums.length; i++) {
        for (var j = 0; j < nums.length; j++) {
            for (var k = 0; k < nums.length; k++) {
                if (nums[i] + nums[j] + nums[k] == 0 && i != j && j != k && k != i) {
                    everyList = [nums[i], nums[j], nums[k]]
                    everyList.sort()
                    result.add(String(everyList))
                }
            }
        }
    }
    result = Array.from(result)
    for (var i = 0; i < result.length; i++) {
        result[i] = result[i].split(',')
        result[i] = result[i].map(parseFloat)
    }
    return result
};

