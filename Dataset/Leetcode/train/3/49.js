 var XXX = function(s) {
    var str=s[0];
    var max=1;
    if(s=='')
        return 0;
    for(var i=1;i<s.length;i++){
        if(str.indexOf(s[i])!=-1){
            str=str.slice(str.indexOf(s[i])+1);
        }
        str+=s[i]; 
        if(max<str.length)
            max=str.length;
    }
    return max;
};

