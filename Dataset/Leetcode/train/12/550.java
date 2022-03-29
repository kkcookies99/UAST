 class Solution {
    public String XXX(int num) {

    StringBuilder sb = new StringBuilder();
    int mNum =  num/1000;
    num = num - (mNum*1000);
    for(int i=0;i<mNum;i++){
        sb.append("M");
    }

    int cmNum = num/900;
    num = num - (cmNum*900);

    for(int i=0;i<cmNum;i++){
        sb.append("CM");
    }

    int dNum = num/500;
    num = num - (dNum*500);

   for(int i=0;i<dNum;i++){
        sb.append("D");
    }

    int cdNum = num/400;
    num = num - (cdNum*400);
    for(int i=0;i<cdNum;i++){
        sb.append("CD");
    }
    int cNum = num/100;
    num = num - (cNum*100);
    for(int i=0;i<cNum;i++){
        sb.append("C");
    }
    

    int xcNum = num/90;
    num = num - (xcNum*90);

    for(int i=0;i<xcNum;i++){
        sb.append("XC");
    }

    int lNum = num/50;
    num = num - (lNum*50);
    for(int i=0;i<lNum;i++){
        sb.append("L");
    }
    

    int xlNum = num/40;
    num = num - (xlNum*40);
    for(int i=0;i<xlNum;i++){
        sb.append("XL");
    }


    int xNum = num/10;
    num = num-(xNum*10);
    for(int i=0;i<xNum;i++){
        sb.append("X");
    }
    

    int ixNum = num/9;
    num = num - (ixNum*9);

    for(int i=0;i<ixNum;i++){
        sb.append("IX");
    }  

    int vNum = num/5;
    num = num - (vNum*5);
    for(int i=0;i<vNum;i++){
        sb.append("V");
    }  


    int ivNum = num/4;
    num = num - (ivNum*4);

    for(int i=0;i<ivNum;i++){
        sb.append("IV");
    }  
    int iNum = num/1;
    num = num - (ivNum*1);

    for(int i=0;i<iNum;i++){
        sb.append("I");
    }  
    return sb.toString();
    }
}

