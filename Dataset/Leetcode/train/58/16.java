 class Solution {
    public int XXX(String s) {
        int number = 0;
        int wordLength = 0;
        for(int i = 0;i < s.length();i++){
            if(s.charAt(i) != ' '){
                number++;
                if( number > wordLength){
                    wordLength = number;
                }
            }else if(s.charAt(i) == ' '){
                number = 0;
            }
        }
        return wordLength;
    }

