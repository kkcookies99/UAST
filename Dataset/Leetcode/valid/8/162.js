var XXX = function(s) {
    let max = Math.pow(2,31) -1
    let min = -Math.pow(2,31)
    s = s.trim()
    let s2 = parseInt(s)
    if(s2 > max){
        return max
    }else if(s2 < min){
        return min
    }
    else if(/^[+|-]?\d(\s+)\d+$/.test(s)){
        return (s[0] === '+' || s[0] === '-') ? s[1] : s[0]
    }else{
        s2 += ''
        let reg = /^-?\d+/
        if(reg.test(s2)){
            s2 = s2.match(/^-|\d+|$.?/g).join('')
            if(s2 > max){
                return max
            }else if(s2 < min){
                return min
            }else{
                return s2
            }
            
        }else{
            return 0
        }
    }
    
    
};

