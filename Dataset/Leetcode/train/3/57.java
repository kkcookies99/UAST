     public int XXX(String s) {
      	int num = 0;
		int n = s.length();
		Set<Character> tempstr = new HashSet<Character>();
		for (int i = 0, j = 0; i < n;i++) {
			if (tempstr.contains(s.charAt(i))) {
				i=i-(j-1);
				num = num > j ? num : j;
				j = 0;
				tempstr.clear();
				tempstr.add(s.charAt(i));
				j++;
			} else {
				j++;
				num = num > j ? num : j;
				tempstr.add(s.charAt(i));
			}
		}
		return num;
    }

