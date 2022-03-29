 var XXX = function(numRows) {
    var res = [];
    for (var i = 0; i < numRows; i++) {
      var arr = [];
      for (var j = 0; j < i + 1; j++) {
        if (i == 0) {
          arr.push(1)
        } else if (i == 1) {
          arr.push(1)
        } else {
          if (j == 0 || j == i) {
            arr.push(1);
          } else {
            arr.push(res[i - 1][j - 1] + res[i - 1][j]);
          }
        }
      }
      res.push(arr);
    }
    return res;
};

