var XXX = function(nums) {
    var row = nums.length, sums = [], visited = {};
    dfs1([], 0);
    return sums 
    function dfs1(array, start){
        sums.push(array);
        for (var i = start; i < nums.length; i++) {
            dfs1(array.concat(nums[i]), i+1)
        }   
    }
};

