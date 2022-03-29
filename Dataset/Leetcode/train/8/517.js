 var XXX = function(s) {
  let a = 0, num = -1;
  let min = Math.pow(-2, 31);
  let max = Math.pow(2, 31) - 1;
  for (let i = 0, len = s.length; i < len; i++) {
    let n = s.charCodeAt(i) - 48;
    if (n === -16) {
      if (num !== -1) break;
    } else if (n === -5) {
      if (num === -1) {
        a = 1;
        num = 0;
      } else break;
    } else if (n === -3) {
      if (num === -1) {
        a = -1;
        num = 0;
      } else break;
    } else if (n >= 0 && n <= 9) {
      if (num === -1) {
        num = n;
        a = 1;
      } else {
        num = num * 10 + n;
        if (a === -1) {
          if (num * a < min) {
            num = 0 - min;
            break;
          }
        } else if (num > max) {
          num = max;
          break;
        }
      }
    } else break;
  }
  num === -1 && (num = 0);
  a === 0 && (a = 1);
  return num *= a;
};

