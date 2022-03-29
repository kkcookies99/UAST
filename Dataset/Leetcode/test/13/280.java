class Solution {
    public int XXX(String s) {
        int sum = 0;
        for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			switch (c) {
			case 'I':
				if(i != s.length() - 1) {
					char cc = s.charAt(i + 1);
					if(cc == 'V') {
						sum += 4;
						i++;
					}else if(cc == 'X') {
						sum += 9;
						i++;
					}else {
						sum += 1;
					}
				}else {
					sum += 1;
				}
				break;
			case 'V':
				sum += 5;
				break;
			case 'X':
				if(i != s.length() - 1) {
					char cc = s.charAt(i + 1);
					if(cc == 'L') {
						sum += 40;
						i++;
					}else if(cc == 'C') {
						sum += 90;
						i++;
					}else {
						sum += 10;
					}
				}else {
					sum += 10;
				}
				break;
			case 'L':
				sum += 50;
				break;
			case 'C':
				if(i != s.length() - 1) {
					char cc = s.charAt(i + 1);
					if(cc == 'D') {
						sum += 400;
						i++;
					}else if(cc == 'M') {
						sum += 900;
						i++;
					}else {
						sum += 100;
					}
				}else {
					sum += 100;
				}
				break;
			case 'D':
				sum += 500;
				break;
			case 'M':
				sum += 1000;
				break;
			default:
				break;
			}
		}
		return sum;
    }
}

