var XXX = function(s) {
  const chart = {'I': 1,'V': 5,'X': 10,'L': 50,'C': 100,'D': '500','M': 1000}
  s = s.split('')
  let sign = 1
  let t = 0
  for (let i = 0; i < s.length; i++) {
    if (chart[s[i]] < chart[s[i + 1]]) {
      sign = -1
    } else {
      sign = 1
    }
    t += (chart[s[i]] * sign)
  }
  return t
};

