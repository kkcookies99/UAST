 class Solution {
public:
    string XXX(int num) {
        string str;
        int temp;
        while((num/1000) != 0){
            temp = num/1000;
            if(temp == 0) break;
            else{ 
                str = str + 'M';
                num = num - 1000;
            }
        }
        while((num/900) != 0){
            temp = num/900;
            if(temp == 0) break;
            else{ 
                str = str + 'C'+'M';
                num = num - 900;
            }
        }
        while((num/500) != 0){
            temp = num/500;
            if(temp == 0) break;
            else{ 
                str = str + 'D';
                num = num - 500;
            }
        }
        while((num/400) != 0){
            temp = num/400;
            if(temp == 0) break;
            else{ 
                str = str + 'C' + 'D';
                num = num - 400;
            }
        }
        while((num/100) != 0){
            temp = num/100;
            if(temp == 0) break;
            else{ 
                str = str + 'C';
                num = num - 100;
            }
        }
        while((num/90) != 0){
            temp = num/90;
            if(temp == 0) break;
            else{ 
                str = str + 'X'+'C';
                num = num - 90;
            }
        }
        while((num/50) != 0){
            temp = num/50;
            if(temp == 0) break;
            else{ 
                str = str + 'L';
                num = num - 50;
            }
        }
        while((num/40) != 0){
            temp = num/40;
            if(temp == 0) break;
            else{ 
                str = str + 'X' + 'L';
                num = num - 40;
            }
        }
        while((num/10) != 0){
            temp = num/10;
            if(temp == 0) break;
            else{ 
                str = str + 'X';
                num = num - 10;
            }
        }
        while((num/9) != 0){
            temp = num/9;
            if(temp == 0) break;
            else{ 
                str = str + 'I'+'X';
                num = num - 9;
            }
        }
        while((num/5) != 0){
            temp = num/5;
            if(temp == 0) break;
            else{ 
                str = str + 'V';
                num = num - 5;
            }
        }
        while((num/4) != 0){
            temp = num/4;
            if(temp == 0) break;
            else{ 
                str = str + 'I' + 'V';
                num = num - 4;
            }
        }
        while(num != 0){
            temp = num;
            if(temp == 0) break;
            else{ 
                str = str + 'I';
                num = num - 1;
            }
        }
        return str;
        
    }
};

