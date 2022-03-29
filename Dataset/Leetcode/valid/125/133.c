 bool XXX(char * s){
    bool flag = true;
    char temp[strlen(s)];
    int len = 0;
 
    for(int i=0; i<strlen(s); i++)
    {
        if((48<=s[i] && s[i]<=57) || (65<=s[i] && s[i]<=90) || (97<=s[i] &&s[i]<=122))
            temp[len++] = s[i];
    }
    if(len==0 || len==1)
        return flag;


    if(len%2 == 0)
    {
        for(int i=0; i<len/2; i++)
        {
            if((*(temp+i)==*(temp+len-i-1)) || ((97<=temp[i] &&temp[i]<=122) && (*(temp+i)==*(temp+len-i-1)+32)) || ((65<=temp[i] && temp[i]<=90) && (*(temp+i)==*(temp+len-i-1)-32)))
                flag = true;
            else
            {
                flag = false; 
                break;
            }       
        }
        
    }
    else if(len%2 == 1)
    {
        for(int i=0; i<(len-1)/2; i++)
        {
            if((*(temp+i)==*(temp+len-i-1)) || ((97<=temp[i] &&temp[i]<=122) && (*(temp+i)==*(temp+len-i-1)+32)) || ((65<=temp[i] && temp[i]<=90) && (*(temp+i)==*(temp+len-i-1)-32)))
                flag = true;
            else
            {
                flag = false; 
                break;
            }
        }
    }

    return flag;
}

