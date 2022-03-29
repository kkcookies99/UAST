var XXX = function(nums) {
    const res = [];
    const backtrack = (path) =>{ //返回函数
        if(path.length === nums.length){ // 长度相等就返回
            res.push(path);
            return;
        }
        nums.forEach(n => {
            if(path.includes(n)){ // 不能包含一模一样的数字
                return;
            }
            backtrack(path.concat(n));
        })
    }
    backtrack([])
    return res;
};

