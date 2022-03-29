var XXX = function(nums) {
    const temp = [];
    const res = [[]];
    const dfs = (begin) => {
        if(begin === nums.length) {
            return;
        }
        for(let i = begin; i < nums.length; i++) {
            temp.push(nums[i]);
            res.push(temp.slice());
            dfs(i+1);
            temp.pop();
        }
    }
    dfs(0);
    return res;
};

