var XXX = function(nums) {
    let cache = [[nums[0]]], nl, gen;
    for(let i=1; i < nums.length; ++i) {
        gen = cache;
        cache = [];
        for(let j=0; j < gen.length; ++j) {
            let nl = gen[j];
            for(let t=0; t <= nl.length; ++t) {
                let copy = nl.slice(0);
                for(let k=nl.length; k > t ; --k) {
                    copy[k] = copy[k-1];
                }
                copy[t] = nums[i];
                cache.push(copy);
            }
        }
    }
    return cache;
};

