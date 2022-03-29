int XXX(int n){
if(n==1) return 1;
int maxhalf=n/2;

double stair=1;
double sum=0;
for(int i=0;i<=maxhalf;i++){//走i个2阶

for(int j=i;j>0;j--)
    stair*=(double)(j+n-i-i)/j;

sum+=stair;
stair=1;
}
return (int)sum;
}

