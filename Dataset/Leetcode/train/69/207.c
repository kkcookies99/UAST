int XXX(int x){
int low=0,high=x;
int mid;long sql,sqll;
while(low<=high){
    mid=(low+high)/2;
    sql=(long)mid*mid;sqll=(long)(mid+1)*(mid+1);
    if(sql<=x && sqll>x) return mid;
    if(sql>x) high=mid-1;
    else low=mid+1;

}
return 0;
}

