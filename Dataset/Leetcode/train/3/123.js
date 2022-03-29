 var XXX = function(s) {
    let window = [];
    let res = 0;
    for(var i = 0 ; i < s.length ; i+=1 ){
        const index = window.indexOf(s[i]);
        if(index == -1){
            window.push(s[i]);
        }else{
            window = [... window.slice(index+1),s[i]];
        }
        res = Math.max(res,window.length);
    }
    return res;
};

