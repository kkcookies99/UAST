 var XXX = function(height) {
let n = height.length;
if (n === 0) {
    return 0;
}
// 定义左指针
let l = 0;
// 定义右指针
let r = n - 1;
// 存储最大值
let max = 0;
// 当两个指针不重合时才继续
while (l != r) {
    // 移动对应较小值的指针，并记录最大值
    if (height[l] > height[r]) {
        max = height[r] * (r - l) > max ? height[r] * (r - l) : max;
        r--;
    } else {
        max = height[l] * (r - l) > max ? height[l] * (r - l) : max;
        l++;
    }
}
return max;
};

