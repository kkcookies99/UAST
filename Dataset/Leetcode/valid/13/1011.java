 class Solution {
    public int XXX(String s) {
        int sum = 0;
		for (int i = 0, len = s.length(); i < len; i++) {
			char the = s.charAt(i);
			char next = ' ';
			if (i < len - 1) {
				next = s.charAt(i + 1);
			}
			switch (the) {
			case 'I':
				switch (next) {
				case 'V':sum += 4;i++;continue;
				case 'X':sum += 9;i++;continue;
				}
			case 'X':
				switch (next) {
				case 'L':sum += 40;i++;continue;
				case 'C':sum += 90;i++;continue;
				}
			case 'C':
				switch (next) {
				case 'D':sum += 400;i++;continue;
				case 'M':sum += 900;i++;continue;
				}
			}
			switch (the) {
			case 'I':sum += 1;break;
			case 'V':sum += 5;break;
			case 'X':sum += 10;break;
			case 'L':sum += 50;break;
			case 'C':sum += 100;break;
			case 'D':sum += 500;break;
			case 'M':sum += 1000;break;
			}
		}
		return sum;
    }
}

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


