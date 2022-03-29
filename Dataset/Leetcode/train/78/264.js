var XXX = function(nums) {
    var len = nums.length;
    if (len <= 1) {
        return [[], nums];
    }
    var result = [[]];

    var dfs = (i, curArr) => {
        var n = nums[i];
        curArr.push(n);
        result.push(curArr);

        for (var j = i + 1; j < len; j ++) {
            dfs(j, curArr.slice());
        }
    };

    for (var i = 0; i < len; i ++) {
        dfs(i, []);
    }

    return result;
}

