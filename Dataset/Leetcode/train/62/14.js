 var XXX = function(m, n) {
    return factorial(m+n-2)/factorial(m-1)/factorial(n-1)
};

const factorial = n => {
    return n>0 ? factorial(n-1)*n : 1;
}

