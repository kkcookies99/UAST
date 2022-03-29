 var XXX = function(nums) {
    var zero = -1;
    var two = nums.length;
    for(var i = 0; i<two;){
        if(nums[i] == 1){
            i++;
        }else if(nums[i] == 0){
            zero++;
            var temp = nums[zero];
            nums[zero] = nums[i];
            nums[i] = temp;
            i++;
        }else {
            two--;
            var temp2 = nums[two];
            nums[two] = nums[i];
            nums[i] = temp2;
        }
    }
};

