 var XXX = function(nums, target) {
    let arr = nums.filter(ele => ele < target);
    return arr.length;
};
/*
filter(currentValue, index, arr)
currentValue:必须，当前元素的值
index:可选，当前元素的索引值
arr:可选，当前元素术域的数组对象
*/

