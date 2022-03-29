 var XXX = function(strs) {
    return strs.length > 0 ? strs.reduce((x,y) => {
        for(let l=x.length, str; l >= 0; --l) {
            str = x.substring(0, l);
            if (y.startsWith(str)) return str;  
        }
    }): "";
};

