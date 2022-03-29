var XXX = function(height) {
    let left = 0;
    let right = height.length - 1;
    let lastLeft = height[left];
    let lastRight = height[right];

    let max = 0;

    while(left < right) {
        if(height[left] < lastLeft) {
            left++;
            continue;
        }
        if(height[right] < lastRight) {
            right--;
            continue;
        }
        lastLeft = height[left];
        lastRight = height[right];
        max = Math.max(Math.min(height[left], height[right]) * (right - left), max);

        if(height[left] < height[right]) {
            left++;
        } else {
            right--;
        }
    }

    return max;
};


