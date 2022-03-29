 int XXX(char* s) {
    char* p = s;
	int i = 0, j = 0, len = 0;
	for(j = 0; *(p+j) != '\0'; j++){
		for(i = 0; i < j; i++){
			if(*(p+i) == *(p+j)){
				p = p + i + 1;
				if(j > len) len = j;
				j = 0;
                break;
			}
		}
	}
	len = (j > len )? j : len;
	return len;
}

