var XXX = function(x) {
    if(x===0){
        return 0;
    }
    if(x<4){
        return 1
    }

    let l=0, r = x;

    // 二分法， 找到最后一个值（一定在[l, r]中，r - l <1）为止
    while(l < r -1){
        m=Math.floor((l+r)/2);

        if(Math.pow(m, 2) > x){
            r = m;
        }else{
            l = m;
        }
    }

    return l;
};


