var XXX = function(nums) {
    if (nums.length == 1) return [nums];
    var result = [];
    for(var i=0; i<nums.length; i++) {
        // 选取一个数字，求剩余数组的全排列
        var restArr = nums.slice(0,i).concat(nums.slice(i+1));
        var nextRes = XXX(restArr);
        for(list of nextRes) {
            list.unshift(nums[i]); // 之前选取的数字插到剩余数组求得的全排列所有结果数组的首位
            result.push(list);
        }
    }
    return result;
};

