 class Solution {
    public String XXX(int num) {
        String one[]  = {"I","II","III","IV","V","VI","VII","VIII","IX"};
        String two[] = {"X","XX","XXX","XL","L","LX","LXX","LXXX","XC"};
        String three[] = {"C","CC","CCC","CD","D","DC","DCC","DCCC","CM"};
        String four[] = {"M","MM","MMM"};
        int k = 1000;
        StringBuilder sb = new StringBuilder();
        while(num!=0){
            if(num>=k){
                if(k==1000){
                    sb.append(four[num/1000-1]);
                    num%=1000;
                }
                else if(k==100){
                    sb.append(three[num/100-1]);
                    num%=100;
                }
                else if(k==10){
                    sb.append(two[num/10-1]);
                    num%=10;
                }                
                else{
                    sb.append(one[num-1]);
                    break;
                }
            }
            k/=10 ;          
        }
        return sb.toString();
    }
}

