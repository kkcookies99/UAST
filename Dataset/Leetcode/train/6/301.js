 var XXX = function(s, numRows) {
    let res=new Array(numRows).fill("");
    let f=-1;
    let i=0;
    if(s.length<=numRows||numRows==1){
        return s
    }
    for(let c of s){
        res[i]+=c;
        if(i==0||i==(numRows-1)){
            f=-f;
        }
        i+=f;
    }
    return res.join("");
};

