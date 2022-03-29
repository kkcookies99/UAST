 var XXX = function(s, numRows) {
    let temp = {}
    let i = 0;
    let asc = true
    let cur = 1
    let res = ''
    while(i<s.length){
        if(asc){
            if(!temp[cur]){
                temp[cur] = []
                temp[cur].push(s[i])
            }else{
                temp[cur].push(s[i])
            }
            cur++
            if(cur>numRows){asc = false; cur = numRows-1}

        }else{
            temp[cur].push(s[i])
            cur -- 
            if(cur==0){
                cur=2
                asc = true
            }

        }
        i++
    }
    let key = 1
    while(key<=numRows){
        temp[key].forEach(element => {
            res+=element
        });
        key++
    }
    return res
};

