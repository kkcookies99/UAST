 var XXX = function(height) {
    var len = height.length;
    var maxValue = 0;
    var h = 0, w = 0, s = 0;
    var computeS = function (height, i, j) {
      h = min(height[i], height[j]);
      w = j - i;
      s = w * h;
      return s;
    }
    for (var i = 0, j = len - 1; i < len && j > i;) {
      maxValue = max(computeS(height, i, j), maxValue);
      if (height[i] < height[j]) {
        i++;
        continue;
      } else {
        --j;
        continue;
      }
    }
    return maxValue;
};

var min = function (a, b) {
    return a > b ? b : a;
}
var max = function (a, b) {
    return a > b ? a : b;
}

