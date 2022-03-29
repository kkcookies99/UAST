var XXX = function(x) {
    if (x<0 || (x%10 === 0 && x!==0)) return false;
    var b, sum = 0, a=x;
    while(a > 0)
    {
      b = a % 10;
      sum = sum * 10 + b;
      a = parseInt(a / 10);
    }
    return sum === x;
};

