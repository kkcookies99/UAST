 var XXX = function(numRows) {
      if(numRows <= 0) {
    return [[]];
  }
  if(numRows == 1) {
    return [[numRows]]
  }
  
  let list = []
  for (let i = 1; i <= numRows; i++) {
    let item = []
    let lastArr = list[i - 2]
    for (let j = 1; j <= i; j++) {
      if(i == 1 || i == 2 || j == 1 || j == i) {
        item.push(1)
      } else {
        
        item.push(lastArr[j-1] + lastArr[j - 2])
      }
    }
    list.push(item)
  }
  return list
};

