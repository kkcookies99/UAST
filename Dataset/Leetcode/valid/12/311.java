 class Solution {
    // 个
    private static String[] unit = new String[]{"","I","II","III","IV","V","VI","VII","VIII","IX"};
    // 十
    private static String[] ten = new String[]{"","X","XX","XXX","XL","L","LX","LXX","LXXX","XC"};
    // 百
    private static String[] hundred = new String[]{"","C","CC","CCC","CD","D","DC","DCC","DCCC","CM"};
    // 千
    private static String[] thousand = new String[]{"","M","MM","MMM"};

    public String XXX(int num) { 
        int a = num / 1000;
        int b = (num / 100) % 10;
        int c = (num / 10) % 10;
        int d = num % 10;
        StringBuilder sb = new StringBuilder();
        sb.append(thousand[a]).append(hundred[b]).append(ten[c]).append(unit[d]);
        return sb.toString();
    }
}

