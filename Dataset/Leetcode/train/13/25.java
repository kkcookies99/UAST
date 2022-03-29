class Solution {
    public int XXX(String s) {
        int num=0,i=0;
        int n=s.length();
        while(i<n){
            if(s.charAt(i)=='M'){
                num+=1000;
                i++;
            }
            else if(s.charAt(i)=='D'){
                num+=500;
                i++;
            }
            else if(s.charAt(i)=='C'){
                if(i+1<n&&s.charAt(i+1)=='M'){
                    num+=900;
                    i+=2;
                }
                else if(i+1<n&&s.charAt(i+1)=='D'){
                    num+=400;
                    i+=2;
                }
                else{
                    num+=100;
                    i++;
                }
            }
            else if(s.charAt(i)=='X'){
                if(i+1<n&&s.charAt(i+1)=='C'){
                    num+=90;
                    i+=2;
                }
                else if(i+1<n&&s.charAt(i+1)=='L'){
                    num+=40;
                    i+=2;
                }
                else{
                    num+=10;
                    i++;
                }
            }
            else if(s.charAt(i)=='I'){
                if(i+1<n&&s.charAt(i+1)=='X'){
                    num+=9;
                    i+=2;
                }
                else if(i+1<n&&s.charAt(i+1)=='V'){
                    num+=4;
                    i+=2;
                }
                else{
                    num+=1;
                    i++;
                }
            }
            else if(s.charAt(i)=='V'){
                num+=5;
                i++;
            }
            else if(s.charAt(i)=='L'){
                num+=50;
                i++;
            }
        }
        return num;
    } 
}

