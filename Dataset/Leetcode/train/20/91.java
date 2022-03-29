     public boolean XXX(String s) {
         int n = s.length();
         for(int i = 0; i < n/2; i++){
			s = s.replace("()", "");
			s = s.replace("{}", "");
			s = s.replace("[]", "");
		 }
		 return s.length() == 0;
    }

