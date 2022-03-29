 var XXX = function(nums) {
  if(nums.length < 3) return []
  nums = nums.sort((a,b)=>a-b)

  const result = []
  const isRepetitive = (a,b)=>{
    return nums[a] === nums[b]
  }

  let pointer = 0
  while(pointer < nums.length && nums[pointer] <= 0){

    let x = pointer + 1
    let y = nums.length - 1
    while(x < y){
      const sum = nums[x] + nums[y]
      if(sum + nums[pointer] === 0) { 
        const op = [nums[pointer], nums[x] , nums[y]]
        result.push(op)
        while(isRepetitive(y, y-1)){ --y }
        --y
        while(isRepetitive(x, x+1)) { ++x } 
        ++x
      }
      else if(sum + nums[pointer] < 0) {
        while(isRepetitive(x, x+1)) { ++x } 
        ++x
      }
      else {
        while(isRepetitive(y, y-1)){ --y }
        --y
      }
    }
    
    while(isRepetitive(pointer, pointer+1)) { ++pointer }
    ++pointer
    
  }

  return result
  
};

