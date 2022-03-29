 var XXX = function(nums) {
  if(nums.length<3) return []
  let map = {}
  const set = new Set()
  const res = []
  nums = nums.sort((a,b)=>a-b).filter((v,i)=>{
    if(i+3<nums.length&&nums[i+3]===v){
      return false
    } 
    return true
  })
  for(let v of nums) {
    if((v in map)){
      map[v]<3&&map[v]++
    }else map[v] = 1
  }
  for(let i=0;i<nums.length-2;i++){
    for(let j=i+1;j<nums.length-1;j++){
      const a = nums[i],b = nums[j]
      map[a]--
      map[b]--
      if(map[a]>=0&&map[b]>=0&&map[-(a+b)]-1>=0){
        const arr = [a,b,-(a+b)].sort((a,b)=>a-b)
        const str = arr.join(',')
        if(!set.has(str)){
          res.push([a,b,-(a+b)])
          set.add(str)
        }
      }
      map[a]++
      map[b]++
    }
  }
  return res
};

