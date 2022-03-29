 bool XXX(char * s){
bool flag=true;
int len = strlen(s);
int i,j;
char * a = (char *)malloc(sizeof(char)*len);
for(i=0,j=0;i<len;i++)
{
    if((s[i]>='0'&& s[i]<='9') ||(s[i]>='a'&& s[i]<='z')||(s[i]>='A'&& s[i]<='Z'))
    {
        if(s[i]>='A'&& s[i]<='Z')
        {
           s[i] =( s[i] | 0x20);  //把大写转小写
        }
        a[j] = s[i];
        j++; 
    }
}
for(int k=0;k<j/2;k++)
{
    if(a[k] != a[j-1-k])
       flag= false;
}
return flag;
}

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


