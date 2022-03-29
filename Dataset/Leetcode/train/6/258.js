 var XXX = function(s, numRows) {
    let result='';
    const map = new Map();
    if(s.length<=numRows||numRows<=1){
        return s;
    }
    let i=0;
    while(i<s.length){
        const k = i%(2*numRows-2);
        if(k<=numRows-1){
            map[k]=map[k]?map[k]+s[i]:s[i];
        }else{
            map[2*numRows-2-k]=map[2*numRows-2-k]?map[2*numRows-2-k]+s[i]:s[i];
        }
        i++;
    }
    for(let j=0;j<numRows;j++){
      result +=  map[j];
    }
    return result;
}

