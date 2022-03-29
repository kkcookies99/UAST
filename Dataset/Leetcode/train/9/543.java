 public boolean XXX(int x) {
        int first=x;
		int result=0;
		if(x<0){
			return false;
		}else{
			try {
				while(x!=0){
					result=result*10+x%10;
					x=x/10;

				}
			} catch (Exception e) {
				return false;
			}
		}
		return result == first;
    }

