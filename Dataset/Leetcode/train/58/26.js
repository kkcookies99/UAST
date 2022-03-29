 var XXX = function(s) {
  let len = s.length;
  for (let i = len - 1; i >= 0; i--) {
    if (s[i] === ' ') {
      if (i === len - 1) {
        len--;
        continue;
      }
      return len - i - 1;
    }
  }
  return len;
};

