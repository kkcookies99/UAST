 char * XXX(int num){
    char t[8] = {'I','V','X','L','C','D','M'};
    char *s = (char *)malloc(20*sizeof(char));
    int j=0,i=0,g=5,len,arr[4]={0},len1=0;
    for(len=0;num!=0;len++){
        arr[len] = num%10;
        num/=10;
    }
    for(i=len-1;i>=0;i--){
        j=arr[i]/5;
        if(arr[i]==4||arr[i]==9){
            j++;
            s[len1++] = t[2*i];
            s[len1++] = t[j+2*i];
        }else{
            if(j==1){
                s[len1++] = t[j+2*i];
            }
            j = arr[i] % 5;
            while(j>0){
                s[len1++] = t[i*2];
                j--;
            }
        }
    }
    s[len1] = '\0';
    return s;
}

