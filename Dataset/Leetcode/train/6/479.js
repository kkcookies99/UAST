 var XXX = function(s, numRows) {
  let len = s.length;
  let str = '';

  if (numRows === 1) return s;

  for (let count = 0; count < numRows; count++) {
    let flag = true;
    let i = count;
    while(i < len) {
      str += s[i];
      if (!count || count === numRows - 1) i += 2 * numRows - 2;
      else {
        if (flag) i += 2 * numRows - 2 - 2 * count;
        else i += 2 * count;
        flag = !flag;
      }
    }
  }
  return str;
};

