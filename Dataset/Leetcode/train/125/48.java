 class Solution {
    public boolean XXX(String s) {
        s = s.toLowerCase();
        char[] letters = s.toCharArray();
        StringBuilder str = new StringBuilder("");
        for(int i = 0;i<letters.length;i++){
            if(isNumber(letters[i]) || isLetter(letters[i])){
                str.append(letters[i]);
            }         
        }
        letters = str.toString().toCharArray();
        char[] temp = reverse(letters);

        return String.valueOf(temp).equals(str.toString());

    }

    boolean isNumber(char number){
        if(number >= '0' && number <= '9'){
            return true;
        }
        return false;
    }

    boolean isLetter(char letter){
        if(letter >= 'a' && letter <= 'z'){
            return true;
        }
        return false;
    }

    char[] reverse(char[] letters){
        int left = 0,right = letters.length - 1;
        while(left < right){
            char temp = letters[left];
            letters[left] = letters[right];
            letters[right] = temp;
            right--;
            left++;
        }
        return letters;
    }
}

