var XXX = function(x) {
  let y = 0;
  if (x < 0 || (x % 10 === 0 && x !== 0)) return false;
  while(x > y) {
    const d = x % 10;
    x = Math.floor(x / 10);
    y = y * 10 + d;
  }
  // 12321
  return x === y || x === Math.floor(y / 10)
};

