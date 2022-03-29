 class Solution {
    public String XXX(int num) {
        StringBuffer ans = new StringBuffer();
		String[] romans = {"M", "D", "C", "L", "X", "V", "I"};
		int[] vals = {1000, 500, 100, 50, 10, 5, 1};
		for(int i = 0; i < 7; i+=2) {
			int t = num / vals[i];
			if(t < 4) {
				for(int j = 0; j < t; j++) ans.append(romans[i]);
			}else if(t == 4) {
				ans.append(romans[i]);
				ans.append(romans[i-1]);
			}else if(t < 9) {
				ans.append(romans[i - 1]);
				for(int j = 0; j < t - 5; j++)ans.append(romans[i]);
			}else {
				ans.append(romans[i]);
				ans.append(romans[i-2]);
			}
			num -= t * vals[i];
		}
		return ans.toString();
    }
}

