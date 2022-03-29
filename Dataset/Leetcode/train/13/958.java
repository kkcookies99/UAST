 class Solution {
    public int XXX(String s) {
        s = s.replace("IV","1").
        replace("IX","2").
        replace("XL","3").
        replace("XC","4").
        replace("CD","5").
        replace("CM","6");
        int ret = 0;
        for(int i = 0;i<s.length();i++){
            switch (s.charAt(i))
            {
                case 'I':
                    ret+=1;
                break;
                case 'V':
                    ret+=5;
                break;
                case 'X':
                    ret+=10;
                break;
                case 'L':
                    ret+=50;
                break;
                case 'C':
                    ret+=100;
                break;
                case 'D':
                    ret+=500;
                break;
                case 'M':
                    ret+=1000;
                break;
                case '1':
                    ret+=4;
                break;
                case '2':
                    ret+=9;
                break;
                case '3':
                    ret+=40;
                break;
                case '4':
                    ret+=90;
                break;
                case '5':
                    ret+=400;
                break;
                case '6':
                    ret+=900;
                break;
                default:
                break;
            }
        }
        return ret;
    }
}

