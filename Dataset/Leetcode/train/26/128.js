 var XXX = function(nums) {
  for(let [index,num] of nums.entries()){
    nums.splice(index,1,"")
    if(!nums.includes(num)) nums.splice(index,1,num)
  }
  return nums.filter(item=> item!=='')
};

