var XXX = function(height) {
    var i = 0, j = height.length - 1, max = 0
    while (i < j) {
        max = Math.max(max, (j - i) * (height[i] > height[j] ? height[j--]: height[i++]))
    }
    return max
};


