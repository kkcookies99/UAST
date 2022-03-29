 var XXX = function(nums, target) {
    if (target > Math.max(...nums)) return nums.length
    if (target < Math.min(...nums)) return 0
    let left = 0
    let right = nums.length
    while(left < right){
        let mid = Math.floor((left+right)/2)
        if (target === nums[mid]) return mid 
        else if (target > nums[mid]){
            if (target < nums[mid+1]) return mid + 1
            else{
                left  = mid + 1
            }
        }else{
            if (target > nums[mid - 1]) return mid
            else{
                right = mid
            }
        }
    }
};

