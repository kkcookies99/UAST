var XXX = function(x) {
  if(x<=1) return Math.floor(x)
  let mid,l=0,r=x
  while(l<=r){
    mid = (l+r)/2
    if(Math.abs(mid-x/mid)<1e-6) return Math.floor(mid+1e-6) 
    if(mid<x/mid) l = mid
    else r = mid
  }
};

