var XXX = function(x) {
  let arr =[]
  let isPlus = x > 0
  let y = Math.abs(x)
  while(y){
    let temp = y % 10
    arr.push(temp)
    y = Math.floor(y / 10)
  }
  let number = 0
  while(arr.length){
    let a = arr.shift()
    let length = arr.length
    let b  = 1
    while(length) {
      b *= 10
      length--
    }
    number += a* b
  }
  if(!isPlus){
    number *= -1
  }
  if(number > Math.pow(2, 31) - 1 || number < -1 * Math.pow(2, 31)){
    return 0
  }
  return number
};

