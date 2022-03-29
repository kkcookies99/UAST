  var XXX = function(nums, target) {
    const len = nums.length;
    let left = 0, right = len - 1, mid;
    while(left <= right){
        mid = parseInt(left + (right-left) / 2);
        if(nums[mid] > target){
            right = mid - 1;
        }
        else if(nums[mid] < target){
            left = mid + 1;
        }
        else{
            return mid; //找到了就直接返回索引值
        }
    }
    return left; //若没找到，则返回目前“光标”位置，该位置前面的数都小于target，后面则都更大
};

