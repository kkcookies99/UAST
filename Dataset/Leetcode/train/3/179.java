 class Solution {
    public int XXX(String s) {
		int length = s.length();
		int sum = 1;	
		int front = 0;
		int end = front + 1;
		if(length == 0) {
			sum = 0;
			return sum;
		}
		
		while(end < length) {
			int tempsum = 0;
			char tempb = s.charAt(end);
			for(int i = front; i < end; i++) {
				char tempa = s.charAt(i);
				if(tempa == tempb) {
					tempsum = end - front;
					front = i+1;
					end = front;
					sum = Math.max(sum, tempsum);
					break;
				}
			}
			end++;
		}
		
		sum = Math.max(sum, (end-front));
		
		return sum;
    }
}

