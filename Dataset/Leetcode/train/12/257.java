 class Solution {
    public String XXX(int num) {
		if (num >= 900)
			if (num >= 1000)
				return "M" + XXX(num - 1000);
			else
				return "CM" + XXX(num - 900);
		if (num >= 400)
			if (num >= 500)
				return "D" + XXX(num - 500);
			else
				return "CD" + XXX(num - 400);
		if (num >= 90)
			if (num >= 100)
				return "C" + XXX(num - 100);
			else
				return "XC" + XXX(num - 90);
		if (num >= 40)
			if (num >= 50)
				return "L" + XXX(num - 50);
			else
				return "XL" + XXX(num - 40);
		if (num >= 9)
			if (num >= 10)
				return "X" + XXX(num - 10);
			else
				return "IX" /*+ XXX(0)*/;
		if (num >= 4)
			if (num >= 5)
				return "V" + XXX(num - 5);
			else
				return "IV" /*+ XXX(0)*/;
		if (num >= 1)
			return "I" + XXX(num - 1);
		return "";
    }
}

