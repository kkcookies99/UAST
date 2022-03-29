int XXX(int n){
int* temp=(int*)malloc((n+1)*sizeof(int));//记录每上x级台阶有多少种可能的方法
temp[0]=1;temp[1]=1;//初始化
for(int i=2;i<=n;i++)
{
    temp[i]=temp[i-1]+temp[i-2];
}
return temp[n];
}

