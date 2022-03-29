 var XXX = function(s) {
  s = s.replaceAll(/[^0-9a-zA-Z]/gi, '').toLowerCase()
  if (!s) return true
  const XXX = (s) => {
    let left = 0, right = s.length - 1
    while (left < right) {
      if (s[left] != s[right]) {
        return false
      }
      left++
      right--
    }
    return true
  }
  if (XXX(s)) {
    return true
  }
  return false
};

