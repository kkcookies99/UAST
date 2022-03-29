 char * XXX(char ** strs, int strsSize){
    if(strsSize > 0)
	{
		char *ans = (char*)calloc(strlen(strs[0])+1, sizeof(char));
		char p;
		int i, j = 0, k = 0;
		for(i = 0;strs[i][j]!='\0';++i)
		{
		        if(i == 0) p = strs[i][j];
			if(strs[i][j]!=p) break;
			if(i == strsSize - 1)
			{
				i = -1;
				++j;
				ans[k++] = p;
			}
		}
		return ans;
	}
	else return "";
}

