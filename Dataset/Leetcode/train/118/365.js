 var XXX = function(numRows) {
  let arr = new Array(numRows);
  for(let i = 0; i < numRows; i++) {
    if(i === 0) {
      arr[0] = [1]
      continue;
    }
    let t = [];
    // 通过上一项计算当前项的值
    for(let j = 0; j < arr[i-1].length+1; j++) {
      t[j] =  (arr[i-1][j-1] || 0) + (arr[i-1][j] || 0);
      arr[i] = t
    }
  }
  return arr
};

