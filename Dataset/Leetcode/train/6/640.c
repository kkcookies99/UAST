 char * XXX(char * s, int numRows){
	char *retArr; 
	int m= 2*numRows - 2;
	int count[1000]={0};
	char pos[1000][100];
	int index;
	int i;
	int len;
	
        if(numRows==1)
        {
            retArr=(char *)malloc(strlen(s)+1);
            strcpy(retArr,s);
            return retArr;
        }

	for(i=0;s[i]!='\0';i++)
	{
		index=i%m;
		if(index>=numRows)       //直接将字符串数组下标映射到二维数组地址
			index= (m-index);
		pos[index][count[index]++]=s[i];
	}
	len=i;

	retArr=(char *)malloc(len+1);
	int j=0;
	for(i=0;i<numRows;i++)
	{
		for(int k=0; k<count[i]; k++)
		{
			retArr[j++]=pos[i][k];
		}
	}
	retArr[j]='\0';
	return retArr;
}


