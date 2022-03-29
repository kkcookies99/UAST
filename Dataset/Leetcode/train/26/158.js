 var XXX = function(nums) {  
    while (true){
        var flag = 0
        for (var i=1;i<nums.length;i++){
            if(nums[i] == nums[i-1]) {
                nums.splice(i, 1)
                flag = 1
                continue
            }
        }
        if (flag == 0) break
    }
    return nums.length
};

