 var XXX = function(l1, l2) {
    let a = Array.from(l1).reverse().join(',').split(',').map(Number); 
    let b = Array.from(l2).reverse().join(',').split(',').map(Number); 
    a=Number(a.join(''))
    b=Number(b.join(''))
    let c = a+b
    let d = Array.from(c+'').reverse().join('').split('').map(Number)
    console.log(d)
    return d
  
};

