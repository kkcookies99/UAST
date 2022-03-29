 var XXX = function(intervals) {
    intervals.sort(function(a,b){
        return a[0]-b[0];
    })
    let curr = intervals[0];
    let res = [];
    for(let i of intervals){
        if(curr[1] >= i[0]){
            curr[1] = Math.max(i[1],curr[1])
        }
        else{
            res.push(curr);
            curr = i;
        }
    }
    res.push(curr);
    return res;
};

