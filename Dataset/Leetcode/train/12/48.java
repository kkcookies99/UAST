 class Solution {
    public String XXX(int num) {
        String[] a1 = {"","M","MM","MMM"};
        String[] a2 = {"","C","CC","CCC","CD","D","DC","DCC","DCCC","CM"};
        String[] a3 = {"","X","XX","XXX","XL","L","LX","LXX","LXXX","XC"};
        String[] a4 = {"","I","II","III","IV","V","VI","VII","VIII","IX"};
        StringBuilder sb = new StringBuilder();
        
        sb.append(a1[num / 1000]);
        sb.append(a2[num % 1000 / 100]);
        sb.append(a3[num % 100 / 10]);
        sb.append(a4[num % 10]);
        
        return sb.toString();
    }
}

