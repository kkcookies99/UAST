 var XXX = function(x) {
    for (var i=0;i<x.toString().length;i++){
        if(x.toString()[i]!==x.toString()[x.toString().length-1-i]){
            return false
        }
    }
    return true
};

