 class Solution {
    public String XXX(int num) {
        int a,b,c,d;
        a=num/1000;
        b=num/100%10;
        c=num/10%10;
        d=num%10;
        StringBuilder res=new StringBuilder();
        String i[]={"","I","II","III","IV","V","VI","VII","VIII","IX"};
        String j[]={"","X","XX","XXX","XL","L","LX","LXX","LXXX","XC"};
        String k[]={"","C","CC","CCC","CD","D","DC","DCC","DCCC","CM"};
        String m[]={"","M","MM","MMM"};
        res.append(m[a]);
        res.append(k[b]);
        res.append(j[c]);
        res.append(i[d]);
        return res.toString();
    }
}

