 var XXX = function(strs) {
  if(strs.length<=1) return strs[0] || ''
  let len = strs[0].length
  let str = [...strs[0]]
  for(let i=1;i<strs.length;i++){
    for(let j=0;j<len;j++){
      if(strs[i][j]!==str[j]){
        str.length=j
        break
      }
    }
  }  
  return str.join('')
};

