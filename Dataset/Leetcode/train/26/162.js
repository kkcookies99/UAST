 var XXX = function(nums) {
    let arr = []
    nums.forEach(function(v){
        if(arr.indexOf(v)==-1){
            arr.push(v)
        }
    })
    return arr
};

