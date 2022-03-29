var XXX = function(nums) {
    return [...nums.reduce((res, cur) => (res = [...res, ...res.map((_) => ([..._, cur])), [cur]], res), []), []];
};


