 var XXX = function(digits) {
  let arr = [...digits]

  for(let i=arr.length-1; i>=0; i--) {
    let num = arr[i] + 1
    // 如果相加后小于0，就可以返回了；否则继续向前加，直到首位
    if (num < 10) {
      arr[i] = num
      return arr
    } else {
      arr[i] = num % 10
    }
  }
    
  // 运行到这，首位肯定大于9了，手动进位
  arr[0] %= 10
  arr.unshift(1)  
  
  return arr
};

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


