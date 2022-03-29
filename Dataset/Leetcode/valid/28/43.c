 int XXX(char * haystack, char * needle){
	int strLen_A = strlen(haystack), strLen_B = strlen(needle), index = -1;
	char *pointer_A = haystack, *pointer_B = needle;
	if ( strLen_A < strLen_B ) return -1;
	if ( strLen_B == 0 ) return 0;
	for ( int i = 0; i < strLen_A; i++ ){
		if ( *(pointer_A + i) == *pointer_B ){
			if ( compareStr( haystack, needle, i, strLen_A, strLen_B) ) return index = i;
		}
	}
	return index;
}

int compareStr(char * haystack, char * needle, int str_index, int strLen_A, int strLen_B){
	int i = str_index, j = 0;
	if ( strLen_A - str_index < strLen_B ) return 0;
	while ( i < strLen_A && j < strLen_B ){
		if ( haystack[i] != needle[j] ){
			return 0;
		}
		i++;
		j++;
	}
	return 1;
}

