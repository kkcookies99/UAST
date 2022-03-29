 var XXX = function(nums) {
    const res = []
    function loop(left, right){
        if(left.length === nums.length){
            res.push(left)
            return
        }
        for(let i = 0;i < right.length; i++){
            loop(left.concat(right[i]),right.filter((_,idx) => idx !== i))
        }
    }
    loop([],nums)
    return res
}

