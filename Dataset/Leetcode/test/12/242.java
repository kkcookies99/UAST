 class Solution {
    public String XXX(int num) {
        
        int thousand = num/1000;
        int hundrud = (num-thousand*1000)/100;
        int ten = (num-thousand*1000-hundrud*100)/10;
        int one = num-thousand*1000-hundrud*100-ten*10;
        
        String[] thousands = new String[] {"M","MM","MMM"};
        String[] hundruds = new String[] {"C","CC","CCC","CD","D","DC","DCC","DCCC","CM"};
        String[] tens = new String[] {"X","XX","XXX","XL","L","LX","LXX","LXXX","XC"};
        String[] ones = new String[] {"I","II","III","IV","V","VI","VII","VIII","IX"};
        
        StringBuilder sb = new StringBuilder();
        if(thousand != 0) {
            sb.append(thousands[thousand-1]);
        }
        if(hundrud != 0) {
            sb.append(hundruds[hundrud-1]);
        }
        if(ten != 0) {
            sb.append(tens[ten-1]);
        }
        if(one != 0) {
            sb.append(ones[one-1]);
        }
        
        return sb.toString();
    
    }
}

