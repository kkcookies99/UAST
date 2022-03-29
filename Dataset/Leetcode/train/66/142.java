 public int[] XXX(int[] digits) {

    int index = digits.length -1;
    do{
       int m = ++digits[index];
       if(m!=10) break;
       digits[index] =0;
       if(index==0) {
           int a[] =new int[digits.length+1];
           a[0]=1;
           return a;
       }     
       index--;
    }while(true);

    return digits;

}

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


