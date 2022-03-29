var XXX = function(nums) {
    var res = []
    var backtrack = function(nums,track){
        if(nums.length === track.length){
            res.push(track.slice())
            return
        }
        for(var i=0;i<nums.length;i++){
            if(track.indexOf(nums[i])>-1){
                continue
            }
            track.push(nums[i])
            backtrack(nums,track)
            track.pop()
        }
    
    }
     backtrack(nums,[])
     return res
};

