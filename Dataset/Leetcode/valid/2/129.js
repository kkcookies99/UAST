var XXX = function(l1, l2) {
    if(Array.isArray(l1) && Array.isArray(l2)) {
        let num1 = parseInt(l1.reverse().join(''))
        let num2 = parseInt(l2.reverse().join(''))
        return (num1 + num2).toString().split('').reverse().map(item => parseInt(item))
    } else {
        return []
    }
    
};

