 char * XXX(int num){
    char *str = (char *)calloc(100,sizeof(char));
    char *p = str;
    int i, n;
    while(num > 0){
        if(num>=1000){
            n = num/1000;
            for(i = 0; i < n; i++){
                *p = 'M';
                p++;
            }
            num %= 1000;
        }else if(num>=900 && num<1000){
            *p = 'C';
            p++;
            *p = 'M';
            p++;
            num -= 900;
        }else if(num>=500 && num<900){
            *p = 'D';
            p++;
            num -= 500;
        }else if(num>=400 && num<500){
            *p = 'C';
            p++;
            *p = 'D';
            p++;
            num -= 400;
        }else if(num>=100 && num<400){
            n = num/100;
            for(i = 0; i < n; i++){
                *p = 'C';
                p++;
            }
            num %= 100;
        }else if(num>=90 && num<100){
            *p = 'X';
            p++;
            *p = 'C';
            p++;
            num-=90;
        }else if(num>=50 && num<90){
            *p = 'L';
            p++;
            num -= 50;
        }else if(num>=40 && num<50){
            *p = 'X';
            p++;
            *p = 'L';
            p++;
            num-=40;
        }else if(num>=10 && num<40){
            n = num/10;
            for(i = 0; i < n; i++){
                *p = 'X';
                p++;
            }
            num %= 10;
        }else if(num == 9){
            *p = 'I';
            p++;
            *p = 'X';
            break;
        }else if(num>=5 && num<9){
            *p = 'V';
            p++;
            num -= 5;
        }else if(num == 4){
            *p = 'I';
            p++;
            *p = 'V';
            break;
        }else{
            *p = 'I';
            p++;
            num -= 1;
        }
    }
    return str;
}

