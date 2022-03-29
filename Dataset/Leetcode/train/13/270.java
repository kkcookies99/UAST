class Solution {
    public int XXX(String s) {
            int result=0;
            for(int i=0;i<s.length();i++){
                switch (s.charAt(i)){
                    case 'I':
                        if(i+1<s.length() && (s.charAt(i+1)=='V' ||s.charAt(i+1)=='V')){
                            result+=4;
                            i++;
                        }else if(i+1<s.length() && (s.charAt(i+1)=='X' ||s.charAt(i+1)=='X')){
                            result+=9;
                            i++;
                        } else {
                            result+=1;
                        }break;
                    case 'V':result+=5;break;
                    case 'X':
                        if(i+1<s.length() && (s.charAt(i+1)=='L' ||s.charAt(i+1)=='L')){
                            result+=40;
                            i++;
                        }else if(i+1<s.length() && (s.charAt(i+1)=='C' ||s.charAt(i+1)=='C')){
                            result+=90;
                            i++;
                        }else {
                            result+=10;
                        }break;
                    case 'L':result+=50;break;
                    case 'C':
                        if(i+1<s.length() && (s.charAt(i+1)=='D' ||s.charAt(i+1)=='D')){
                            result+=400;
                            i++;
                        }else if(i+1<s.length() && (s.charAt(i+1)=='M' ||s.charAt(i+1)=='M')){
                            result+=900;
                            i++;
                        }else {
                            result+=100;
                        }break;
                    case 'D':result+=500;break;
                    case 'M':result+=1000;break;
                }
            }
            return result;
        }
}

