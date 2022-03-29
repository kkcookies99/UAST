class Solution {
    public int XXX(String s) {
        int sum=0;
        int len=s.length();
        int a=1000,b=0;
        for(int i=0;i<len;i++){
            switch(s.charAt(i)){
                    case 'I' : b=1;break;
                    case 'V' : b=5;break;
                    case 'X' : b=10;break;
                    case 'L' : b=50;break;
                    case 'C' : b=100;break;
                    case 'D' : b=500;break;
                    case 'M' : b=1000;
            }
            if(b/a==5||b/a==10){
                sum=sum+b-2*a;
            }
            else sum+=b;
            a=b;
        }
        return sum;
    }
}

