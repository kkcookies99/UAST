var XXX = function(nums) {
    let _result = [];
    let _num0 = 0;
    for(let i = 0; i < nums.length; i++) {
        let _v = nums[i];
        if(_v === 0) {
            _result.unshift(_v);
            _num0++;
        } else if (_v === 2) {
            _result.push(_v)
        } else {
            _result.splice(_num0, 0, _v)
        }
        console.log(_result);
    }
    
    return _result
};

