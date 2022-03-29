 char * XXX(char ** strs, int strsSize){
    char* prefix = (char*)malloc(200);
	int i = 0, k = 0;
	for (k = 0; strs[0][k] != '\0'; k++)
	{
		for (i = 0; i < strsSize; i++)
		{
			if (strs[i][k] != strs[0][k])
			{
				prefix[k] = '\0';
				return prefix;
			}
		}
		prefix[k] = strs[0][k];
	}
	prefix[k] = '\0';
	return prefix;
}

