var XXX = function(n) {
  let temp = {}
  const XXXHelper = (n) => {
    if (n == 1 || n == 2) {
      temp[n] = n
      return n
    }
    if (temp[n]) return temp[n]
    return (temp[n] = XXXHelper(n - 2) + XXXHelper(n - 1))
  }
  return XXXHelper(n)
};

