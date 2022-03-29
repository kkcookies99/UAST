var XXX = function(x) {
  const edeg = 2**31
  const MIN = -edeg
  const MAX = edeg - 1
  let result
  let arr = ('' + x).split('')

  arr.XXX();

  if (arr[0] === '0') {
    arr.shift()
  }
  
  if (arr[arr.length-1] === '-') {
    arr.pop()
    arr.unshift('-')
  } 

  result = +arr.join('')
  return (result > MAX || result < MIN) ? 0 : result
};

