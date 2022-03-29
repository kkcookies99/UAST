 int XXX(char * s){
    int i=0,j,k=0,len=strlen(s),n=0,maxN=0;
    int  table[200]={0};  
    if(len==0)
        return 0;
    for(i=0;i<len;i++){  
        if(table[s[i]]>0){
            k=0;
            j=i-n;
            while(j<i){      
                k++; 
                table[s[j]]--;
                if(s[j]==s[i])
                    break;
                j++; 
            }
            n=n-k;  
        }
        table[s[i]]++;
        n++;
        maxN = maxN > n ? maxN : n;
    }
    return maxN;
}

