 var XXX = function(s, numRows) {
  let temp = []
  if(numRows === 1) return s
  for(let i=0;i<s.length;i++){
    let k = i % (2 * numRows - 2)
    if(k > (numRows - 1)){
        k = 2 * numRows -2 -k
    }
    temp[k] ? {} : temp[k] = ''
    temp[k] += s[i]
  }
  return temp.join('')
};

