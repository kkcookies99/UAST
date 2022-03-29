 var XXX = function(nums) {
    const neg = nums.filter(val => val < 0).sort()
    const pos = nums.filter(val => val >= 0).sort()
    const res = [] 
    for(let i = 0; i< neg.length; i++) {
        for(let j =0; j < pos.length; j++) {
            if(neg[i] === neg[i-1] || pos[j] == pos[j-1]) {
                continue
            }
            let need = 0 - neg[i] - pos[j]
            if(need < 0) {
                let index = neg.indexOf(need, i+1) 
                if(index !== -1) {
                    res.push([neg[i], pos[j], need])
                }
            } else {
                let index = pos.indexOf(need, j+1)
                if(index !== -1) {
                    res.push([neg[i], pos[j], need])
                }
            }
        }
    }
    if(pos[0] ===0 && pos[1] ===0 && pos[2] === 0) {
        res.push([0, 0, 0])
    }
    return res
};

