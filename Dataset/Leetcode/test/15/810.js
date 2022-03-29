 var XXX = function(nums) {
  if(nums.length<3) return []
  const res = new Set()
  // 排序+数据过滤
  nums = nums.sort((a,b)=>a-b).filter((v,i)=>{
    if(i+3<nums.length&&v===nums[i+3]) {
      return false
    }else return true
  })
  let left = 1,right = nums.length -1
  for(let i=0;nums[i]<=0;i++){
    left = i+1
    right = nums.length -1
    while(left<right){
      // 右过大，减小
      if(nums[right]+nums[left]+nums[i]>0){
        right--
      }else if(nums[right]+nums[left]+nums[i]<0){
        // 左过小，增大
        left++
      }else{
        res.add([nums[i],nums[left],nums[right]].join(','))
        left++
        right--
      }
    }
    while(i+1<nums.length-2&&nums[i]===nums[i+1]&&left>i+1) i++;
  }
  return [...res].map(s=>s.split(','))
};

