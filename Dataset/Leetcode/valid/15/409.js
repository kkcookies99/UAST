 var XXX = function(nums) {
    nums.sort((x,y)=>x>y)
    var results = new Set()
    len = nums.length
    function dfs (index, result) {
        if (result.length === 3){
            if (result[0] + result[1] + result[2] === 0) {
                results.add(result.join(','))
            }
            return
        }
        
        for (var i = index; i < len; i++) {
            dfs(i+1, result.concat(nums[i]))
        }
    }
    dfs(0, [])
    return Array.from(results).map(x=>x.split(','))
};

