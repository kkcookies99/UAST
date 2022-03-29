    public int XXX(int n) {
        int cnt = n / 2;
		int x = 0;
		double result = 0;
		
		while(cnt >= x) {
			double rn = 1;
			double rm = 1;
			double rnm = 1;

			for(int i = 1; i <= n; i++) {
				rn = rn * i;
				if(i <= (n-x)) {
					rnm = rnm * i;
				}
				if(i <= x) {
					rm = rm * i;
				}
			}
			result = result + (rn / (rm * rnm));
			x++;
			n--;
		}
		
		return (int)result;
    }

