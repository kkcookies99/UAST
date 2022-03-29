var XXX = function(nums) {
    for(var i =1; i<nums.length;i++){
        nums[i] = nums[i] + Math.max(nums[i-1],0)
    }
    return Math.max(...nums)
};

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


