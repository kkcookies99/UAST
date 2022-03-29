class Solution {
    public int XXX(int n) {
        if(n == 0)
			return 0;
		if(n == 1)
			return 1;
		if(n == 2)
			return 2;
		int lastF1 = 1,lastF2 = 0,nextF1 = 0,nextF2 = 1;
		int resultF1 = 0,resultF2 = 0;
		for(int i=3;i<=n;i++){
			resultF1 = lastF1 + nextF1;
			resultF2 = lastF2 + nextF2;
			lastF1 = nextF1;
			lastF2 = nextF2;
			nextF1 = resultF1;
			nextF2 = resultF2;
		}
		return resultF1+2*resultF2;
    }
}

