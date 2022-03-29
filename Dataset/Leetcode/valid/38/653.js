 var XXX = function(n) {
  if(n === 1){
    return "1"
  }
  let str = XXX(n - 1)
  let array = []
  let start = 0
  for(let i = 0; i < str.length; i++){
    if(str[i] !== str[start]){
      array.push((i - start).toString())
      array.push(str[start])
      start = i
    }
    if(i === str.length - 1){
      array.push((i - start + 1).toString())
      array.push(str[start])
    }
  }
  return array.join("")
};
