var XXX = function(x) {
    if(x<0) return false;
    let nums = [];
    while(x) {
        nums.push(x%10);
        x = Math.floor(x/10); 
    } 
    for(let i=0; i< Math.floor(nums.length/2); i++) {
        if(nums[i] !== nums[nums.length-i-1]) {
            return false;
        }
    }
    return true;
    
};

