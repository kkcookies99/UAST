 var XXX = function(s, numRows) {
    var length = s.length;
    if (numRows == 1) return s;
    var cycleLen = numRows * 2 - 2;
    var aZig = [];
    for (var i = 0; i < numRows; i++){
        for (var j = 0; j + i < length; j=j+cycleLen){
            aZig.push(s.charAt(j + i));
            if (i!=0 && i!=numRows -1 && j + cycleLen - i < length){
                aZig.push(s.charAt(j + cycleLen - i));
            }
        }
    }

    return aZig.join("");
};


