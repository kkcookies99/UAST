 var XXX = function(nums) {
	let sz = nums.length;
	if(sz==0){
		return 0;
	}
	let a = 0;
	for(let b=1;b<sz;b++){
        if(nums[a]< nums[b]){
        	a++;
        	nums[a]=nums[b]
        }
         
	}

	console.log(nums)
	return a+1 ;
};

