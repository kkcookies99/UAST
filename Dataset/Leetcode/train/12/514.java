 class Solution {
    public String XXX(int num) {
        String str="";
        Map<Integer,String> map= new HashMap<>();
        map.put(1, "I");map.put(2, "II");map.put(3, "III");map.put(4, "IV");
        map.put(5, "V");map.put(6, "VI");map.put(7, "VII");map.put(8, "VIII");map.put(9, "IX");
        map.put(10, "X");map.put(20, "XX");map.put(30, "XXX");map.put(40, "XL");
        map.put(50, "L");map.put(60, "LX");map.put(70, "LXX");map.put(80, "LXXX");map.put(90, "XC");
        map.put(100, "C");map.put(200, "CC");map.put(300, "CCC");map.put(400, "CD");
        map.put(500, "D");map.put(600, "DC");map.put(700, "DCC");map.put(800, "DCCC");map.put(900, "CM");
        map.put(1000, "M");map.put(2000, "MM");map.put(3000, "MMM");
        String s = String.valueOf(num);
        if (map.get(num)!=null){
            str=map.get(num);
        }else{
            for (int i=0;i<s.length();i++){
                int integer = Integer.valueOf(String.valueOf(s.charAt(i)));
                int nub=1;
                for (int j=0;j<s.length()-i-1;j++){
                    nub*=10;
                }
                integer=integer*nub;
                str=str+(map.get(integer)!=null?map.get(integer):"");
                nub=1;
            }
        }

        return str;
    }
}

