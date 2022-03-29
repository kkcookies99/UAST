 class Solution {
    public String XXX(int num) {
        int a = num%10;
        num/=10;
        int b =num%10;
        num/=10;
        int c =num%10;
        num/=10;
        int d = num%10;
        return num4(d)+num3(c)+num2(b)+num1(a);
        
    }
    private String num4(int n){
        String res = "";
        switch(n){
            case 1:res="M";break;
            case 2:res="MM";break;
            case 3:res="MMM";break;
            case 0:res="";break;
        }
        return res;
    }
    private String num3(int n){
        String res = "";
        switch(n){
            case 1:res="C";break;
            case 2:res="CC";break;
            case 3:res="CCC";break;
            case 4:res="CD";break;
            case 5:res="D";break;
            case 6:res="DC";break;
            case 7:res="DCC";break;
            case 8:res="DCCC";break;
            case 9:res="CM";break;
            case 0:res="";break;
        }
        return res;
    }
    private String num2(int n){
        String res = "";
        switch(n){
            case 1:res="X";break;
            case 2:res="XX";break;
            case 3:res="XXX";break;
            case 4:res="XL";break;
            case 5:res="L";break;
            case 6:res="LX";break;
            case 7:res="LXX";break;
            case 8:res="LXXX";break;
            case 9:res="XC";break;
            case 0:res="";break;
        }
        return res;
    }
    private String num1(int n){
        String res = "";
        switch(n){
            case 1:res="I";break;
            case 2:res="II";break;
            case 3:res="III";break;
            case 4:res="IV";break;
            case 5:res="V";break;
            case 6:res="VI";break;
            case 7:res="VII";break;
            case 8:res="VIII";break;
            case 9:res="IX";break;
            case 0:res="";break;            
        }
        return res;
    }
}

