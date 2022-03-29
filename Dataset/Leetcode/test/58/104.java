 public int XXX(String s) {
        s = s.trim();
	char[] charArray = s.toCharArray();
	int j=0;
	for(int i=charArray.length-1 ; i>=0 ; i--){
		if(" ".equals(String.valueOf(charArray[i]))){
			break;
		}
		j++;
	}
	return j;
    }

