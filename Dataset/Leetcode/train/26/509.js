 var XXX = function(nums) {
    let k = [];
    for(let i = 0; i < nums.length; i++){
        if(nums[i] != nums[i + 1]){
            k.push(nums[i]);
        }
    }
    return k.length;
};  

