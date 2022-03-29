 var XXX = function(num) {
    var a = ['M', "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"]
    var b = [1000, 900, 500,  400,  100, 90,   50,  40,   10,    9,    5,   4,    1]
    var ret = '';
    var numCopy = num;

    for(var i = 0;i<a.length;i++){
        if(numCopy == 0){ break; }

        var y = Math.floor(numCopy / b[i]);
        numCopy = numCopy - b[i] * y;
        for(var m = 0;m<y;m++){  ret+=a[i]; }
    }
   
    return ret;
};

