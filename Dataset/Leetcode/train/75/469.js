 var XXX = function(nums) {
    let len = nums.length
    let j = 0
    let temp = 0
    for (let i = 1; i < len; i++) {
        j = i
        let temp = nums[j]
        while (i-1 >= 0 && temp < nums[i-1]) {
            i--
        }
        [nums[i], nums[j]] = [nums[j], nums[i]]
    }
    return nums
};
undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


