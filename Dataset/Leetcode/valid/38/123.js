var XXX = function(n) {
  let arr = ['1','11','21','1211','111221']
  if (n <= 5) return arr[n - 1]
  let temp = '111221'
  for (let i = 6; i <= n; i++) {
    let s = temp.charAt(0), num = 1, str = ''
    for (let j = 1; j < temp.length; j++) {
      if (temp.charAt(j) !== s) {
        str = str + String(num) + s
        num = 1
        s = temp.charAt(j)
      } else {
        num++  
      }
      if (j == temp.length - 1) {
        str = str + String(num) + s
      }
    }
    temp = str
  }
  return temp
};

