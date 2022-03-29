var XXX = function(height) {
    let max = 0;
    for (let i = 0, j = height.length - 1; i < j;) {
        const minHeight = height[i] < height[j] ? height[i++] : height[j--];
        const area = (j - i + 1) * minHeight;
        max = Math.max(max, area);
    }
    return max;
};


