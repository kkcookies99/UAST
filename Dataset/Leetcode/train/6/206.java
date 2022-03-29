  public String XXX(String s, int numRows) {
        if(numRows == 1){
            return s;
        }
        int len = s.length(); 
         char c=' ';
		 int count = 0;  
		 int width = (len/((numRows-1)*2))*(numRows-1)+1;
		 int highth = numRows;  
		 char[][] temp = new char[highth][width];
		 for(int j= 0; j<width;j++) {
			 for(int i = 0;i<highth;i++) {
				 if(count < len) {
					 int index = j%(numRows-1);
					 if(index == 0) {
						 temp[i][j] = s.charAt(count++);
					 }else {
						 i = i+numRows-1-index;
						 temp[i][j] = s.charAt(count++);
						 break;
					}
				 }
			 }
		 }
		 String result ="";
		 for(int i= 0;i<highth;i++) {
			 for(int j = 0;j<width;j++) {
				 if(temp[i][j] != '0') {
					 result=result+""+temp[i][j];
				 }
			 }
		 }
	     return result;
    }

