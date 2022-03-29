 class Solution {
    public String XXX(int num) {
        int ge = num%10;
        int shi = num/10%10;
        int bai = num/100%10;
        int qian = num/1000%10;
        String [] sqian ={"","M","MM","MMM"};
        String [] sbai ={"","C","CC","CCC","CD","D","DC","DCC","DCCC","CM"};
        String [] sshi ={"","X","XX","XXX","XL","L","LX","LXX","LXXX","XC"};
        String [] sge = {"","I","II","III","IV","V","VI","VII","VIII","IX"};
        return sqian[qian]+sbai[bai]+sshi[shi]+sge[ge];
    }
}

