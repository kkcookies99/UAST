 bool XXX(char * s){
    char list[10000];
    int j=1;
    while(*s)
    {
        if(*s=='('||*s=='['||*s=='{')
        {
        	list[j]=*s;
        	j++;
        	s++;
		}
		else
		{
			if((*s==')'&&list[j-1]!='(')||(*s==']'&&list[j-1]!='[')||(*s=='}'&&list[j-1]!='{'))
            	return false;
	        else
	        {
	            j--;
	            list[j]=0;
	        }
	        s++;
		} 
    }
    if(list[1]!=0)
        return false;
    return true;
}

