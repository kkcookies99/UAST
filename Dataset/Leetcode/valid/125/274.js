 var XXX = function(s) {
  s = s.toLowerCase()
  let
    left = 0,
    right = s.length - 1
  while (left < right) {
    while (left < right && !(s[left] >= 'a' && s[left] <= 'z' || s[left] >= '0' && s[left] <= '9')) left ++
    while (left < right && !(s[right] >= 'a' && s[right] <= 'z' || s[right] >= '0' && s[right] <= '9')) right --
    if (left < right && s[left ++] !== s[right --]) return false
  }
  return true
};

