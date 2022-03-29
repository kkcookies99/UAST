 class Solution {
    public int XXX(String s) {
        int sum = 0;
        int i = 0;
        for(; i < s.length() - 1;i++){
                if(getVal(s.charAt(i)) < getVal(s.charAt(i + 1))){
                 sum -= getVal(s.charAt(i));    
                }else{
                sum += getVal(s.charAt(i)); 
                }
                 
        }
        return sum + getVal(s.charAt(i));
            
    }

    public static int getVal(char ch){
        switch(ch){
            case 'I':return 1;
            case 'V':return 5;
            case 'X':return 10;
            case 'L':return 50;
            case 'C':return 100;
            case 'D':return 500;
            case 'M':return 1000;
            default:return 0;
        }
    }
}

