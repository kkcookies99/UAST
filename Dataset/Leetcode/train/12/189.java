 class Solution {
    public String XXX(int num) {
		StringBuilder sb = new StringBuilder();
		num = handle(sb, num, "M", 1000);
		num = handle(sb, num, "D", 500);
		num = handle(sb, num, "C", 100);
		num = handle(sb, num, "L", 50);
		num = handle(sb, num, "X", 10);
		num = handle(sb, num, "V", 5);
		handle(sb, num, "I", 1);
		return sb.toString().replace("IIII", "IV").replace("VIV", "IX").replace("XXXX", "XL").replace("LXL", "XC")
				.replace("CCCC", "CD").replace("DCD", "CM");
	}

	private int handle(StringBuilder rs, int num, String romanStr, int romainInt) {
		if (num / romainInt > 0) {
			for (int i = 0; i < num / romainInt; i++) {
				rs.append(romanStr);
			}
			num = num - romainInt * (num / romainInt);
		}
		return num;
	}
}

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


