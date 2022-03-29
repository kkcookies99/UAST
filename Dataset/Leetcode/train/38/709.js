   var XXX = function(n) {
  let count = 1
  let str = '1'
  for (let i = 1; i < n; i++) {
    let s = ''
    for (let j = 1; j < str.length; j++) {
      if (str[j] !== str[j - 1]) {
        s += count + '' + str[j - 1]
        count = 1
      } else {
        count++
      }
    }
    str = s + count + str[str.length - 1]
    count = 1
  }
  return str
};

