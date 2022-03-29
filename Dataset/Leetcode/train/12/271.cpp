 class Solution {
public:
    string XXX(int num) {
        string result="";
        int count;
        count=num/1000;
        for(int i=0;i<count;i++) result+='M';
        num%=1000;
        if(num>=900){
            result+="CM";
            num-=900;
        }
        else if(num>=500){
            result+='D';
            num-=500;
        }
        if(num>=400){
            result+="CD";
            num-=400;
        }
        else{
            count=num/100;
            for(int i=0;i<count;i++) result+='C';
            num%=100;
        }
        if(num>=90){
            result+="XC";
            num-=90;
        }
        else if(num>=50){
            result+='L';
            num-=50;
        }
        if(num>=40){
            result+="XL";
            num-=40;
        }
        else{
            count=num/10;
            for(int i=0;i<count;i++) result+='X';
            num%=10;
        }
        if(num==9){
            result+="IX";
            return result;
        }
        else if(num>=5){
            result+='V';
            num-=5;
        }
        if(num==4){
            result+="IV";
            return result;
        }
        else for(int i=0;i<num;i++) result+='I';
        return result;
    }
};

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


