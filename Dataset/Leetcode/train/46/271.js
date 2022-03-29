var XXX = function(nums) {
    let res=[]
    function backtracing(path){
        if(path.length == nums.length){
            res.push(path)
            return
        }
        nums.forEach(val=>{
            if(path.includes(val)) return
            backtracing([...path,val])
        })
    }
    backtracing([])
    return res
};

