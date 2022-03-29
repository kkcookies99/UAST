  public String XXX(int num) {
    StringBuilder str = new StringBuilder("");
    int div=1;
    while(num/div>=10) div *=10;
    while(num>0){
        while (num/div==0) div = div/10;
        int left = num/div;
        if(div>=1000){
            for(int i=1;i<=left;i++){
                str=str.append('M');
            }
        }else if(div>=100){
            doSth(str,'C','D','M',left);
        }else if(div>=10){
            doSth(str,'X','L','C',left);
        }else if(div>=1){
            doSth(str,'I','V','X',left);
        }
        num = num%div;
        div=div/10;
    }
    return str.toString();
}
private void doSth(StringBuilder str,char a,char b,char c,int left){
    if(left<4){
        do{
            str = str.append(a);
            left--;
        }while(left>0);
    }else if(left==4){
        str = str.append(a).append(b);
    }else if (left==5){
        str = str.append(b);
    }else if(left<9){
        str = str.append(b);
        do{
            str = str.append(a);
            left--;
        }while((left-5)>0);
    }else if(left==9){
        str = str.append(a).append(c);
    }
}

