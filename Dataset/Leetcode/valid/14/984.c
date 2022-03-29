 char * XXX(char ** strs, int strsSize){
int i=1,j=0;
if(strsSize==0) 
return "";
for(j=0;j<strlen(strs[0]);j++){ //多出j=0初始条件
    for(i=1;i<strsSize;i++){      //多出i=1初始条件
        if(strs[0][j]!=strs[i][j])
        {
        strs[0][j]='\0';
        break;
        }
    }
} 
return strs[0];
}


