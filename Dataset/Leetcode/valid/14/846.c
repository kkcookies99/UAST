 char * XXX(char ** strs, int strsSize){

    char lastC=0;
    int i;
    int j=0;
    for(j=0;;j++){
        lastC=strs[0][j];
        for(i=0;i<strsSize;i++){ 
           // if(i!=0){
                if(strs[i][j]!=lastC ||strs[i][j]==0){
                 //   printf("%d",j);
                    strs[i][j]=0;
                    return strs[i];
                }
            //}

            lastC=strs[i][j];
        }
    }
    return 0;
}```

