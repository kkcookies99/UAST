 public String XXX(int num) {
       StringBuilder str = new StringBuilder();
		int a[] = new int[] {1000,900,500,400,100,90,50,40,10,9,5,4,1};
		String s[] = {"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
		int i = 0;
		while(num != 0 && i < a.length) {
			if(num - a[i] >=0) {
				num -= a[i];
				str.append(s[i]);	
			}else
				i++;
		}
		return str.toString();
    }

