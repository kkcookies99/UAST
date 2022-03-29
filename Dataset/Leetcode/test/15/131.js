 var XXX = function(nums) {
    let len = nums.length;
    let arr = [];
    nums.sort(function(a, b) {
        return a - b
    })
    for(let i = 0; i < len; i++) {
        if(i > 0 && nums[i] === nums[i - 1]) {
            continue;
        }
        let a = nums[i],
            l = i + 1,
            r = len - 1;
        while(l < r) {
            let b = nums[l],
                c = nums[r];
            let sum = a + b + c;
            if(sum === 0) {
                arr.push([a,b,c])
            } 
            if(sum <= 0) {
                while(nums[l] === b){
                    l++
                }
            } 
            if(sum >= 0){
                while(nums[r] === c){
                    r--
                }
            }
        }
    }
    return arr;
};

