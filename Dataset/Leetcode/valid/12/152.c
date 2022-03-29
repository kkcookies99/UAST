 char * XXX(int num){
	char *retArr=(char *)malloc(20*sizeof(char));
	int i;
	int len=0;
	int a;
	
	if(num<10) 
		goto L3;
	else if(num<100)
		goto L2;
	else if(num<1000)
		goto L1;	
	
	a=num/1000;
	num=num%1000;
	for(i=0;i<a;i++)
		retArr[len++]='M';

L1:	if(num>=900)
	{
		num -=900;
		retArr[len++]='C';
		retArr[len++]='M';
	}
	else if(num>=500)
	{
		num -=500;
		retArr[len++]='D';
	}
	else if(num>=400)
	{ 
		num -=400;
		retArr[len++]='C';
		retArr[len++]='D'; 
	}
	a=num/100;
	num=num%100;
	for(i=0;i<a;i++)
		retArr[len++]='C';
		
L2:	if(num>=90)
	{
		num -=90;
		retArr[len++]='X';
		retArr[len++]='C';
	}
	else if(num>=50)
	{
		num -=50;
		retArr[len++]='L';
	}
	else if(num>=40)
	{
		num -=40;
		retArr[len++]='X';
		retArr[len++]='L';
	}
	a=num/10;
	num=num%10;
	for(i=0;i<a;i++)
		retArr[len++]='X';
	
L3:	if(num>=9)
	{
		num -= 9;
		retArr[len++]='I';
		retArr[len++]='X';
	}
	else if(num>=5)	
	{
		num -=5;
		retArr[len++]='V';
	}	
	else if(num>=4)
	{
		num -=4;
		retArr[len++]='I';
		retArr[len++]='V';
	}
	for(i=0;i<num;i++)
		retArr[len++]='I';
	retArr[len]='\0';
	
	return retArr; 
}


