 var XXX = function(s) {
  let left = 0
  let res = 0
  const map = new Map()
  for(let right = 0;right<s.length;right++){
      if(map.has(s[right]) && map.get(s[right]) >= left){
          left = map.get(s[right]) + 1 //相同就滑动一位
      }
      res = Math.max(res,right - left + 1)
      map.set(s[right],right)
  }
  return res
};

