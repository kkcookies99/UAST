 var XXX = function(nums, target) {
   var result = [];
    for (var i = 0; i < nums.length; i++) {
        var template = target - nums[i];
        if (result.indexOf(template) !== -1) {
            return [result.indexOf(template), i];
        }
        result.push(nums[i]);
    }
};

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


