var XXX = function(nums) {
    var len = nums.length;
    if (len === 1) {
        return true;
    }
    var result = false;

    var toEndIdx = len - 1; // 用于记录可以到达终点的数字索引

    for (var i = len - 2; i >= 0; i --) {
        var n = nums[i];
        var remain = toEndIdx - i;  // 至少需要多少步可以跳到 下一个可到达终点的节点
        if (n >= remain) {
            toEndIdx = i;
        }
    }
    if (toEndIdx === 0) {
        result = true;
    }
    return result;
};

