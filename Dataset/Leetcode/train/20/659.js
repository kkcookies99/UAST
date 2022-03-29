     var XXX = function(s) {
        if(s.length<=1){
            return false
        }
        let obj={
            '(':")",
            '{':'}',
            '[':']'
        }
        let arr=[]
        for(let i of s){
            if(obj.hasOwnProperty(i)){
                arr.unshift(obj[i])
            }else{
                if(arr.shift()!=i){
                    return false
                }
            }  
        }
        return arr.length==0

