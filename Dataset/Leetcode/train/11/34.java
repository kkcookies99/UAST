public int XXX(int[] height) {
	int start = 0;
	int end = height.length-1;
	int max = 0;
	int sum = 0;
	while(start<=end) {
		if( height[start]< height[end]) {
			sum = (end-start)* height[start];
			max = max>sum?max:sum;
			start++;
		}else {
			sum = (end-start)* height[end];
			max = max>sum?max:sum;
			end--;
		}
	
	}
	return max;
}

