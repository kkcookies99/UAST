var XXX = function(x) {
    if(x < 0){
        return false;
    }
    let oldVal = x;
    let newVal = (x + '').split("");
    let temp = newVal.reverse();
    if(oldVal === parseInt(temp.join("")))
        return true;  
    else  
        return false;
};

