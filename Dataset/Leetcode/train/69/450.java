public int XXX(int x) {
        List<Integer> list = new ArrayList<Integer>();
	
	while(x != 0) {
		int num = x % 100;
		x = x / 100;
		list.add(num);
	}
	
	int res = 0;
	int rem = 0;
	int idx = list.size() - 1;
	
	while(idx != -1) {
		int num = rem * 100 + list.get(idx);
		int quo = 1;
		while((20 * res + quo) * quo <= num) {
			quo++;
		}
		rem = num - (20 * res + quo - 1) * (quo - 1);
		res = res * 10 + (quo - 1);
		idx--;
	}
	
	return res;
}
