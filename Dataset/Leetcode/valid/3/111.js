 var XXX = function(s) {
  if (s.length <= 1) return s.length
  let obj = {
    [s.charAt(0)]: true
  }
  let max = -1, p = 0
  for (let i = 1; i < s.length; i++) {
    if (obj[s[i]] === undefined) {
      obj[s[i]] = true
    } else {
      while (p < i && s[p] != s[i]) {
        delete obj[s[p]]
        p++
      }
      p++
    }
    max = Math.max(max, i - p + 1)
  }
  return max
};

