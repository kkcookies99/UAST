var XXX = function(s) {
  let map = {
      'I' : 1,
      'V' : 5,
      'X' : 10,
      'L' : 50,
      'C' : 100,
      'D' : 500,
      'M' : 1000
  }

  let res = 0
  for(let i = 0;i<s.length;i++){
      if(map[s[i]] < map[s[i+1]]){
          res += map[s[i+1]] - map[s[i]]
          s = s.substring(i+1)
      }else{
          res += map[s[i]]
          s = s.substring(i)
      }
      i = 0
  }

  return res
};

