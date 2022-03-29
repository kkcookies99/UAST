 int XXX(char * haystack, char * needle){
if(haystack==NULL)
return -2;
if(needle==NULL)
return 0;
int i=0,j=0;
while(haystack[i]!='\0'&&needle[j]!='\0')
{
    if(haystack[i]==needle[j])
    {
        i++;
        j++;
    }
    else
    {
        i=i-j+1;
        j=0;
    }
}
if(needle[j]=='\0')
return i-j;
else
return -1;
}

