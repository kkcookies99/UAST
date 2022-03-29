var XXX = function(intervals) {
  const len = intervals.length
  if(len<=1) return intervals
  intervals.sort((a,b)=>a[0]-b[0])
  for(let i=0;i<intervals.length-1;i++){
    const cur = intervals[i]
    const next = intervals[i+1]
    if(cur[1]>next[1]||cur[1]>=next[0]){
      if(cur[1]<=next[1]) cur[1] = next[1]
      intervals.splice(i+1,1)
      i--
    }
  }
  return intervals
};

