public int XXX(String s) {
    int index = 0;
    int len = s.length();
    int sum = 0;
    while (index <= len - 1) {
        char c = s.charAt(index);
        char c1 = '*';
        if(index + 1<len){
            c1 = s.charAt(index + 1);
        }

        if(c == 'I' && c1 == 'V'){
            sum+=4;
            index++;
        }else if(c == 'I' && c1 == 'X'){
            sum+=9;
            index++;
        }else if(c == 'X' && c1 == 'L'){
            sum+=40;
            index++;
        }else if(c == 'X' && c1 == 'C'){
            sum+=90;
            index++;
        }else if(c == 'C' && c1 == 'D'){
            sum+=400;
            index++;
        }else if(c == 'C' && c1 == 'M'){
            sum+=900;
            index++;
        }else if(c == 'M'){
            sum+=1000;
        }else if(c == 'D'){
            sum+=500;
        }else if(c == 'C'){
            sum+=100;
        }else if(c == 'L'){
            sum+=50;
        }else if(c == 'X'){
            sum+=10;
        }else if(c == 'V'){
            sum+=5;
        }else if(c == 'I'){
            sum+=1;
        }
        index++;
    }
    return sum;
}

