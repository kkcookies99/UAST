var XXX = function(nums1, nums2) {
    let nums = countingSort(nums1, nums2);
    if (nums.length === 0) {
        return 0;
    }
    if (nums.length === 1) {
        return nums[0];
    }
    var mid = (nums.length - 1) / 2;
    return (nums[Math.floor(mid)] + nums[Math.ceil(mid)]) / 2;
};

function countingSort(nums1, nums2) {
    let countingArray = [];
    var min1 = counting(nums1, countingArray);
    var min2 = counting(nums2, countingArray);
    return countingToList(countingArray, Math.min(min1, min2));
}

function counting(nums, counting) {
    var min = 0;
    for (let i  = 0; i < nums.length; i++) {
        let num = nums[i];
        if (counting[num]) {
            counting[num] += 1;
        } else {
            counting[num] = 1;
        }
        if (num < min) {
            min = num;
        }
    }
    return min;
}

function countingToList(countingArray, min) {
    let sortedArray = [];
    for (let i = min; i < countingArray.length; i++) {
        if (countingArray[i]) {
            for (let j = 0; j < countingArray[i]; j++) {
                sortedArray.push(i);
            }
        }
    }
    return sortedArray;
}