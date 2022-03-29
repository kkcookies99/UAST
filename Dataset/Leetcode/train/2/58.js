var XXX = function(l1, l2) {
    const l3 = parseInt(l1.reverse().join('')) + parseInt(l2.reverse().join(''))
    const converToArray = number => [...`${number}`].map(el => parseInt(el))
    return converToArray(l3)
};

