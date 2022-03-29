 var XXX = function(nums) {
    let res = [[]];
    nums.forEach(item => {
        const add = [];
        res.forEach(arr => add.push([...arr, item]))
        res = [...res, ...add]; 
    })
    return res;
};

