class Solution {
    public int XXX(int x) {
         int max[] = {0};
         if (x==1) {
		return 1;
	}
        if(46340*46340<=x
){
            return 46340;
        }
	 for (int i = 0; i <= x/2; i++) {
		if (i*i<=x) {
			max[0]=i;
		}
		else {
			break;
		}
	}
	return max[0];
	
    }
}

