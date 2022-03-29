int XXX(char * s){
    int sum=0;
    while(*(s) != NULL)
    {
        switch (*s)
        {
            case 'I': sum = sum + 1;break;
		    case 'V': sum = sum + 5;break;
		    case 'X': sum = sum + 10;break;
		    case 'L': sum = sum + 50;break;
		    case 'C': sum = sum + 100;break;
		    case 'D': sum = sum + 500;break;
		    case 'M': sum = sum + 1000;break;

        }
        if(*(s+1)!=NULL)
        {
        if( (*(s)=='I') && ( (*(s+1)=='V') || (*(s+1)=='X') ) )
            sum = sum - 2;
        if( (*(s)=='X') && ( (*(s+1)=='L') || (*(s+1)=='C') ) )
            sum = sum - 20;
        if( (*(s)=='C') && ( (*(s+1)=='D') || (*(s+1)=='M') ) )
            sum = sum - 200;
        }
        s=s+1;
    }
    return sum;
}

