var XXX = function(x) {
  let res = x
  while(res-x/res>1e-6){
    res = (res+x/res)/2
  }
  return Math.floor(res)
};

