 var XXX = function(height) {
    var max = 0
    for(var i = 0; i < height.length; i++) {
        for(var j = i; j < height.length; j++) {
            var y = Math.min(height[i], height[j])
            var x = Math.abs(j - i)
            max = max < x * y ? x * y : max
        }
    }
    return max
};

