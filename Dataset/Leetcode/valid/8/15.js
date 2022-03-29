var XXX = function(s) {
   s =  Number(s.trim().replace(/[^\d-]*(-?\d*)[^\d]*/,'$1'))
   if(isNaN(s))  return 0 
   if(s < Math.pow(-2,31)) return Math.pow(-2,31)
   if(s >= Math.pow(2,31)) return Math.pow(2,31)-1
   return s
};

