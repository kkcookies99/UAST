 class Solution {
    public String XXX(int num) {
        StringBuilder sb = new StringBuilder();
        num = appendRoman(num,1000,'M',sb);
        num = appendRoman2(num,900,"CM",sb);
        num = appendRoman(num,500,'D',sb);
        num = appendRoman2(num,400,"CD",sb);
        num = appendRoman(num,100,'C',sb);
        num = appendRoman2(num,90,"XC",sb);
        num = appendRoman(num,50,'L',sb);
        num = appendRoman2(num,40,"XL",sb);
        num = appendRoman(num,10,'X',sb);
        num = appendRoman2(num,9,"IX",sb);
        num = appendRoman(num,5,'V',sb);
        num = appendRoman2(num,4,"IV",sb);
        num = appendRoman(num,1,'I',sb);
        return sb.toString();
    }
    public static int appendRoman2(int num,int romanInt,String roman,StringBuilder sb){
        if (num >= romanInt){
            num -= romanInt;
            sb.append(roman);
        }
        return num;
    }

    public static int appendRoman(int num,int romanInt,char roman,StringBuilder sb){
        if (num >= romanInt){
            sb.append(roman);
            num -= romanInt;
            return appendRoman(num, romanInt, roman, sb);
        }
        return num;
    }
}

