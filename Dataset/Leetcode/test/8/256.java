class Solution {
    public int XXX(String s) {
        String str = s.trim();
        char[] car = str.toCharArray();

        if(car.length == 0){return 0;}
        long a =0;
        for(int i =0;i<car.length;i++){
            if(car[i]=='-'){
                if(i==0){continue;}
                else if(Character.isDigit(car[i-1]))
                         {break;}
                     else{return 0;}
            }else if(car[i]=='+'){
                if(i==0){continue;}
                else if(Character.isDigit(car[i-1])){break;}
                    else{return 0;}
            }else if(!Character.isDigit(car[i])){
                if(i==0){return 0;}
                else{break;}
            }else if(Character.isDigit(car[i])){
                int b = car[i]-'0';
                a = a*10 +b;
                if(a>Math.pow(2,31)-1){
                    if(car[0]=='-'){
                        return (int)-Math.pow(2,31);
                    }else{return (int)Math.pow(2,31);}
                }
            }
        }
        if(car[0]=='-'){
           return (int)-a;
        }else{return (int)a;}
    }
}

