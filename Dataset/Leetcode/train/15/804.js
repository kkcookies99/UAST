 var XXX = function(nums) {
  if(nums.length<3) return []
  nums.sort((a,b)=>a-b)
  let left,right
  const res = []
  for(let i=0;nums[i]<=0&&i<nums.length;i++){
    if(i>0&&nums[i]===nums[i-1]) continue
    left = i+1
    right = nums.length-1
    while(left<right){
      const sum = nums[left] + nums[right] + nums[i]
      if(sum<0) ++left
      else if(sum>0) right--
      else{
        res.push([nums[i],nums[left],nums[right]])
        while(left<right&&nums[left]===nums[++left]);
        while(left<right&&nums[right]===nums[--right]);
      }
    }
  }
  return res
};

