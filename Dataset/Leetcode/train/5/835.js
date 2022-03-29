 var XXX = function(s) {
    let i=0;
    let j=1;
    let res=[];
    let res2=[];
    if(s.length<2){
        return s
    }
    for(let k=0;k<s.length;k++){
        res[k]=s[k];
        res2[k]=s[k];
        i=k-1;
        j=k;
        while(i>=0&&j<s.length){
            if(s[i]==s[j]){
                res[k]=s.slice(i,j+1)
                i--;
                j++;
            }else{
                break;
            }
        }
        i=k-1;
        j=k+1;
        while(i>=0&&j<s.length){
            if(s[i]==s[j]){
                res2[k]=s.slice(i,j+1)
                i--;
                j++;
            }else{
                break;
            }
        }

    }
    if(res.length==0){
        return res
    }
    let n=res.reduce((pre,cur)=>pre.length<cur.length?cur:pre);
    let m=res2.reduce((pre,cur)=>pre.length<cur.length?cur:pre);
    return m.length>n.length?m:n
};

