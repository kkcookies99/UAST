var XXX = function(nums) {
    let arrs = [];
    function getArr(nums, tmp = []) {
        [...nums].map((num, i) => {     
            let temp = [...tmp, num];      
            if(nums.length == 1) {
                arrs.push(temp);
            } else {
                let arr = [...nums];
                arr.splice(i, 1);
                getArr(arr, temp);
            }
        })
    };
    getArr(nums);
    return arrs;
};

