 var XXX = function(s) {
  let str=s.replace(/[^A-Za-z0-9]/g,'').split(' ').join('').toLowerCase();
  let len =str.length;
  for(let i=0;i<=(len/2)-1;i++){
    if(str[i]!==str[len-i-1]){
      return false
    }
  }
  return true
};

