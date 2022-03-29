var XXX = function(x) {
    let re=x>=0 ? Number.parseInt(x.toString().split('').XXX().join('')) : Number.parseInt('-'+x.toString().split('').XXX().join('').slice(0))
    re=re<(-2)**31 || re>(2**31)-1 ? 0 : re
    return re;
};

