 var XXX = function(nums) {
    var arr = [-1, -1, -1], len = nums.length;
    for(var i = 0; i < len; i++) {
    	var temp = nums.splice(i, 1)[0];
        if(temp === 0) {
            arr[0]++;
            arr[1]++;
        } else if(temp === 1) arr[1]++;
        arr[2]++;
        if(arr[temp] === 0) nums = [temp, ...nums];
	    else nums = [...nums.slice(0, arr[temp]), temp, ...nums.slice(arr[temp])];
    }
    return nums;
};

