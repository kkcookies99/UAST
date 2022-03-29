char * XXX(char * a, char * b){
	short len_a, len_b, len_c;
	short i , j, k;
	char temp = 0, start;
	char *c = NULL;
	
	len_a = strlen(a);
	len_b = strlen(b);
	len_c = (len_a > len_b)?(len_a+2):(len_b+2);
	
	c = malloc(sizeof(char)*len_c);
	*(c+len_c-1) = '\0';
	
	for(i=len_c-2;i>=0;i--)
	{
		j = (len_a-1) - (len_c-2-i);
		k = (len_b-1) - (len_c-2-i);
		if( j>=0 && k>=0)
		{
			if(temp == 1)
			{
				if(*(a+j) == '1' && *(b+k) == '1')
					*(c+i) = '1';
				else if(*(a+j) == '0' && *(b+k) == '0')
				{
					*(c+i) = '1';
					temp = 0;
				}
				else
					*(c+i) = '0';
			}
			else
			{
				if(*(a+j) == '1' && *(b+k) == '1')
				{
					*(c+i) = '0';
					temp = 1;
				}
				else if(*(a+j) == '0' && *(b+k) == '0')
					*(c+i) = '0';
				else
					*(c+i) = '1';
			}
		}
		else if(j>=0)
		{
			if(temp == 1)
			{
				if(*(a+j) == '1')
					*(c+i) = '0';
				else
				{
					*(c+i) = '1';
					temp = 0;
				}
			}
			else
				*(c+i) = *(a+j);
		}
		else if(k>=0)
		{
			if(temp == 1)
			{
				if(*(b+k) == '1')
					*(c+i) = '0';
				else
				{
					*(c+i) = '1';
					temp = 0;
				}
			}
			else
				*(c+i) = *(b+k);
		}
		else if(temp == 1)
		{
			*(c+i) = '1';
			start = 0;
		}
		else
			start = 1;
	}
	
	if(start == 0)
		return c;
	else
	{
		char *d = malloc(sizeof(char)*(len_c-1));
		memcpy(d, c+1, len_c-1);
		free(c);
		return d;
	}
}

