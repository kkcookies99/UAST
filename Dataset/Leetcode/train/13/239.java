class Solution {
    public int XXX(String s) {
       int sum = 0;
        for(int i = 0 ; i <s.length();i++){
            if(s.charAt(i)=='M'){
                sum +=1000;
            }
            if(s.charAt(i)=='D'){
                sum += 500;
            }
            if(s.charAt(i) =='C'){
                sum +=100;
            }
            if(s.charAt(i) =='L'){
                sum +=50;
            }
            if(s.charAt(i) == 'X'){
                sum +=10;
            }
            if(s.charAt(i)=='V'){
                sum +=5;
            }
            if(s.charAt(i)=='I'){
                sum +=1;
            }
        }
        if(s.contains("CM") || s.contains("CD")){
            sum -=200;
        }
        if(s.contains("XC") || s.contains("XL")){
            sum -=20;
        }
        if(s.contains("IX") || s.contains("IV")){
            sum -=2;
        }
        return sum;
        
    }
}

