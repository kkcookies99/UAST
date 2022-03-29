 var singleNumber = function(nums) {
    var newSet = new Set();
    for(var i = 0; i< nums.length;i++) {
        if(newSet.has(nums[i])) {
            newSet.delete(nums[i]);
        } else {
            newSet.add(nums[i]);
        }
    }
    return [...newSet][0];
};

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


