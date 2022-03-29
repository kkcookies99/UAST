var XXX = function(x) {
    let f = false;
    if(x < 0){
        x = -x; 
        f = true;
    }
    let xx = String(x).split(''); 
    xx.XXX();
    let xxx = Number(xx.join(''));
    if(f){
       xxx = -xxx;
        if(xxx >= Math.pow(-2,31)){
           return xxx;
           } else {
               return 0;
           }
       } else {
           if(xxx <= Math.pow(2,31) - 1){
                return xxx;
            }  else {
                return 0;
            }
       }
   
};

