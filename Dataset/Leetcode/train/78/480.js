 var XXX = function(nums) {
    //回溯
    var res = [];
    backtrack(0, nums, res, []);
    return res;    
    function backtrack(n, nums, res, [...temp]){
        res.push(temp);
        for(var i=n;i<nums.length;i++){
            temp.push(nums[i]);
            backtrack(i+1, nums, res, temp);
            temp.pop();
        }
    }
};

