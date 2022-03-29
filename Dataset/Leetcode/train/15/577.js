 var XXX = function(nums) {
  nums.sort();
  if(nums.length<3) return [];
  let result = [];
    function XXX(target,start) {
        let hash = {};
        let i = start;
        while(i<nums.length) {
            if(hash[nums[i]]) {
                result.push([nums[start-1],nums[hash[nums[i]]],nums[i]])
                while(nums[i+1] === nums[i]) {
                    i++;
                }
            }
            hash[target - nums[i]] = i;
        i++;
        }
    }
    let i = 0;
    while(i<nums.length-1) {
        if(nums[i] > 0) break;
        XXX(0 - nums[i],i+1);
        while(nums[i+1] === nums[i]) {
            i++;
        }
        i++;
    }
    return result;
};

