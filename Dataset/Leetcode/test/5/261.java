 public class Solution {
    public String XXX(String s) {
        char[] array = s.toCharArray();
		int length = array.length;
        if(length == 0) return "";
		int a = 1, b = 0, c = 0;
		int max = 1;
		int maxIndex = length / 2;
		int model = 1;
		
		for(int mid = length / 2, i = 1; mid + 1 >= max && mid <= length - max; i++) {
			a = 1;
			b = 0;
			c = 0;
			for(; a <= mid && a < length - mid && array[mid - a] == array[mid + a]; a++);
			if(a > max) {
				maxIndex = mid;
				model = 1;
				max = a;
			}
			for(; b <= mid && b < length - 1 - mid && array[mid - b] == array[mid + 1 + b]; b++);
			if(b >= max) {
				maxIndex = mid;
				model = 3;
				max = b;
			}
			mid = mid >= length / 2 ? mid - i : mid + i;
		}
		return s.substring(maxIndex - max + (model & 1), maxIndex + max + (model >> 1 & 1));
    }
}

