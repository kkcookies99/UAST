 var XXX = function(s, numRows) {
  if (numRows == 1) return s
  let arr = new Array(numRows).fill('').map(item => new Array(s.length).fill(''))
  let index = 0, i = 0, j = 0, tip = 0
  while (index < s.length) {
    const val = s.charAt(index++)
    if (tip == 0 && i < numRows - 1) {
      arr[i][j] = val
      i++
    } else {
      tip = 1
    }
    if (tip == 1) {
      arr[i][j] = val
      i--
      j++
    }
    if (i == 0) {
      tip = 0
    }
  }
  let aStr = []
  for (let i = 0; i < arr.length; i++) {
    aStr.push(arr[i].join(''))
  }
  return aStr.join('')
};

