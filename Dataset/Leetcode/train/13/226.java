class Solution {
    public int XXX(String s) {
        int sum = 0, p = 0;
        for(int i=s.length()-1;i>=0;i--){
        	int n = switchNum(s.charAt(i));
            if(p > n) {
            	sum -= n;
            }else{
            	sum += n;
            }
            p = n;
        }
        return sum;
    }
    
    public static int switchNum(char roman){
	switch(roman){
			case 'I': return 1;
			case 'V' :return 5;
			case 'X' :return 10;
			case 'L' :return 50;
			case 'C' :return 100;
			case 'D' :return 500;
			case 'M' :return 1000;
		}
		return 0;
	}
}

