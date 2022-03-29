 class Solution {
   public int XXX(String str) {
		String s = "";
		str = str.trim();
		if (!"".equals(str)) {
			if (str.charAt(0) == '+' || str.charAt(0) == '-') {
				if (str.length() == 1) {
					return 0;
				} else {
					if (Character.isDigit(str.charAt(1))) {
						for (int i = 0; i < str.length(); i++) {
							if (i == 0) {
								s += str.charAt(i);
							} else {
								if (Character.isDigit(str.charAt(i))) {
									s += str.charAt(i);
								} else {
									break;
								}
							}
						}
						try{
							int ans=Integer.valueOf(s);
							return ans;
						}catch(Exception e){
							if(s.charAt(0)=='-'){
								return Integer.MIN_VALUE;
							}else{
								return Integer.MAX_VALUE;
							}
						}
					} else {
						return 0;
					}
				}

			} else if (Character.isDigit(str.charAt(0))) {
				for (int i = 0; i < str.length(); i++) {
					if (i == 0) {
						s += str.charAt(i);
					} else {
						if (Character.isDigit(str.charAt(i))) {
							s += str.charAt(i);
						} else {
							break;
						}
					}
				}
				try{
					int ans=Integer.valueOf(s);
					return ans;
				}catch(Exception e){
					if(s.charAt(0)=='-'){
						return Integer.MIN_VALUE;
					}else{
						return Integer.MAX_VALUE;
					}
				}
			} else {
				return 0;
			}
		} else {
			return 0;
		}

	}
}```

