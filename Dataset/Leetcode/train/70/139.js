var XXX = function(n) {
  if (n === 1) return 1;
  let first = 1;
  let second = 2;
  let stairs = n;
  for (let i = 3; i <= n; i++) {
    stairs = first + second;
    first = second;
    second = stairs;
  }
  return stairs;
};

