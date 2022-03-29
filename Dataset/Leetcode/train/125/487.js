 var XXX = function(s) {
    let reg=/\W/g;

    s=s.replace(reg,"").toLowerCase();
    let len=s.length
    for(let i=0;i<len/2;i++){
        if(s[i]!=s[len-i-1]){
            return false;
        }
    }
    return true;
};

