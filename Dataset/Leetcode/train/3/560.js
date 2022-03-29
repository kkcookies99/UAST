 var XXX = function(s) {
    if(s.length){
        var max_l = 0;
        var max_s ='';
        var max_i = 0;
        for(var j = 1;j<s.length;j++){
            var i = j - 1;
            if(s[i] !== s[j]){
                max_s += s[i];
                if(max_s.length > max_l){
                    max_l = max_s.length; // 
                }
            }else{
                max_s = '';
                max_i = i;
            }            
        }
        return s.substr(max_i + 1,max_i + max_l);
    }
    return '';
};



