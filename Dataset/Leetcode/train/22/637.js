 var XXX = function(n) {
    var  res = []
    var backTrack = function(left,right,track){
        if(left>right) return
        if(left<0||right<0) return
        if(left ===0 &&right===0){
            res.push(track.join(''))
        }
        track.push('(')
        backTrack(left-1,right,track)
        track.pop()

        track.push(')')
        backTrack(left,right-1,track)
        track.pop()
    }
    backTrack(n,n,[])
    return res
};

