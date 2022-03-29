 var XXX = function(s) {
    let left=0,right=0,max=0,len=s.length;
    while(right<len){
      const i=s.indexOf(s[right],left)
      if(i!==-1 && i<right){
        left=i+1
      } 
      max=Math.max(max,right-left+1)
      right++
    }
    return max
};

