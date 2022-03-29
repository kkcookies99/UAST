char * XXX(char * a, char * b){

    int carry = 0;

    int alen = strlen(a);
    int blen = strlen(b);

    int length = (alen>blen? alen:blen)+2;

    char* result = (char*)malloc(sizeof(char)*length);
    result[length-1] = '\0';

    for(int i = alen-1,j = blen-1,k = length -2; (i >=0)||(j >= 0); i--,j--,k--)
    {
        int sum = carry;
       sum += (i >= 0? a[i]-'0':0);
       sum += (j >= 0? b[j]-'0':0);

       carry = sum /2;
       result[k] = '0'+ sum % 2;
    }
	
    if(carry == 0)
       return result+1;    
    result[0] = '1'; 
    return result;
}

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


