 string XXX(string s) 
{
	int n=1, indexb=0, maxLen=0;
	int len=s.length();
	if(len==1)
		return s;
	else if(len==2)
		return s[0]==s[1]?s:s.substr(0, 1);
	for(int i=1; i<len-1; i++)
	{	
		n=1;
		while(s[i-n]==s[i+n-1])
		{
			if(2*n>maxLen)
				indexb=i-n, maxLen=2*n;
			n++;
			if(i-n<0||i+n-1>=len)
				break;
		}
		n=1;
		while(s[i-n]==s[i+n])
		{
			if(2*n+1>maxLen)
				indexb=i-n, maxLen=2*n+1;
			n++;
			if(i-n<0||i+n>=len)
				break;
		}
	}
	if(maxLen==0)
		s[len-1]==s[len-2]?(indexb=len-2, maxLen=2):(maxLen=1);
	return s.substr(indexb, maxLen);
}

