 bool XXX(char * s){
int length = strlen(s);
if((length%2) || *s==')' || *s==']' || *s=='}')
{
    return false;
}
char *tmp = malloc(sizeof(char)*length);
int index = -1;
int cnt = 0;
while(cnt<length)
{
    if(*s==')' || *s==']' || *s=='}')
    {
        if(index<0)
        {
            return false;
        }
        if((*s-tmp[index]==1)||(*s-tmp[index]==2))
        {
            tmp[index] = 0;
            index--;
            s++;
        }
        else
        {
            return false;
        }
    }
    else
    {
        index++;
        tmp[index] = *s;
        s++;
    }
    cnt++;
}
if(index==-1)
{
    return true;
}
else
{
    return false;
}
}

