 public int XXX(int x) {
		String t = Integer.toString(x);
		StringBuilder sb = new StringBuilder();
		try {
			if(x >= 0){
				for(int i = t.length() - 1; i >= 0 ; i--){
					sb.append(t.charAt(i));
				}
			}else{
				sb.append("-");
				for(int i = t.length() - 1; i > 0 ; i--){
					sb.append(t.charAt(i));
				}
			}
			return Integer.parseInt(sb.toString());
		} catch (Exception e) {
			e.printStackTrace();
            return 0;
			
		}
        
    }

