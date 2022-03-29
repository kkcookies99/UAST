 #define min(a,b) (((a)<(b))?(a):(b))

char str[4000];
char outstr[1000];
int p[4000];

char* XXX(char* s) {
    int len = 0,i = 0,j=0,temp = 0,maxNum=0;
    while(*(s+len) != '\0')
        len += 1;
    if(s == NULL)
        return "";
    if(len < 2)
        return s;
    memset(str,0,2000);
    memset(outstr,0,1000);
    memset(p,0,1000);
    for(int i=len;i>=0;i--)
	{
		str[2*i+2]=s[i];
		str[2*i+1]='#';
    }
    
    str[0]='$';
	int mx=0,id=0;
	for(i=0;i<=2*len+1;i++)
	{
		if(mx>i)
			p[i]=min(p[2*id-i],mx-i);
		else
			p[i]=1;
		if ((i-p[i] >= 0)&&((i+p[i])<=(2*len+1)))
		{
			while(str[i-p[i]]==str[i+p[i]]) 
				p[i]++;
		}
		if(i+p[i]>mx)
		{
			mx=i+p[i];
			id=i;
		}
	}
    
    temp = p[0];
    
	for(i=0;i<=2*len+1;i++)
	{
		if (temp<=p[i])
			temp=p[i];
	}
    
	for (i=0;i<=2*len+1;i++)
	{
		if (p[i]==temp)
		{
			maxNum=i;
			break;
		}
	}

	for (i=0;i<temp*2-1;i++)
	{
		if (str[maxNum-temp+1+i] != '#')
		{
			outstr[j]=str[maxNum-temp+1+i];
			j += 1;
		}
		
	}
    
    return outstr;
}

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }

