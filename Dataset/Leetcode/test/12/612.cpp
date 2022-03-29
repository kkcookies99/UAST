 class Solution {
public:

    string getDefult(int num){
        switch(num){
            case 4:
                return "IV";
            case 9:
                return "IX";
            case 40:
                return "XL";
            case 90:
                return "XC";
            case 400:
                return "CD";
            case 900:
                return "CM";
        }
        return "";
    }

    string XXX(int num) {
        switch(num){
            case 4:
                return "IV";
            case 9:
                return "IX";
            case 40:
                return "XL";
            case 90:
                return "XC";
            case 400:
                return "CD";
            case 900:
                return "CM";
        }
        string str;
        for(int i=0; i<num/1000; i++){
            str+='M';
        }
        num-=((num/1000)*1000);
        if(num>=900){
            str+=getDefult(900);
            num-=900;
        }
            for(int i=0; i<num/500; i++){
                str+='D';
            }
            num-=((num/500)*500);
        if(num>=400){
            str+=getDefult(400);
            num-=400;
        }
            for(int i=0; i<num/100; i++){
                str+='C';
            }
            num-=((num/100)*100);
        if(num>=90){
            str+=getDefult(90);
            num-=90;
        }
            for(int i=0; i<num/50; i++){
                str+='L';
            }
            num-=((num/50)*50);
        if(num>=40){
            str+=getDefult(40);
            num-=40;
        }
            for(int i=0; i<num/10; i++){
                str+='X';
            }
            num-=((num/10)*10);
        if(num>=9){
            str+=getDefult(9);
            num-=9;
        }
        for(int i=0; i<num/5; i++){
            str+='V';
        }
        num-=((num/5)*5);    
        if(num>=4){
            str+=getDefult(4);
            num-=4;
        }
        for(int i=0; i<num; i++){
            str+='I';
        }
        return str;
    }
};

