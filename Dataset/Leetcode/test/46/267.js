var XXX = function(nums) {
    let arr1 = [],
        arr2 = [
            [nums.shift()]
        ];
    for (; nums.length > 0;) {
        arr1 = arr2;
        arr2 = [];
        let curr = nums.shift();
        arr1.forEach(n => {
            for (let len = n.length; len >= 0; len--) {
                let temp = [...n];
                temp.splice(len, 0, curr);
                arr2.push(temp)
            }
        })
    }
    return arr2;
};

