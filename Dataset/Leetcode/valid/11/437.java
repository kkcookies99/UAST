 public int XXX(int[] height) {
        int start=0,end=height.length-1;
		int maxA=0;
		while(start<end) {
			if(start==end||start+1==end) {
				maxA=Math.max(maxA, (end-start)*Math.min(height[start], height[end]));
				break;
			}
			maxA=Math.max(maxA, (end-start)*Math.min(height[start], height[end]));
			if(height[start]>height[end]) {
				end--;
			}else {
				start++;
			}
		}
		return maxA;
    }

