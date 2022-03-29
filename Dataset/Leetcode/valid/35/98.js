     var XXX = function(nums, target) {
        let i;
        for(i =0;i<nums.length;i++){
            if(target==nums[i]){
                return i
            }else if(target<nums[i]){
                return i
            }
        }
        return i

