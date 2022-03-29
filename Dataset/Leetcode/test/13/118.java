class Solution {
    public int XXX(String s) {
        int result = 0;
        char [] numbers = s.toCharArray();
        for(int i = 0; i< numbers.length; i++) {
            int numberi = getNumber(numbers[i]);
            if((i+1) < numbers.length){
                int numberj = getNumber(numbers[i+1]);
                if(numberi < numberj){
                    numberi = numberj - numberi;
                    i++;
                }
            }
            result = result + numberi;
        }
        return result;
    }
    private int getNumber(char number){
        int result = 0;
        switch(number){
            case 'I' : result = 1;
                       break;
            case 'V' : result = 5;
                       break;
            case 'X' : result = 10;
                       break;
            case 'L' : result = 50;
                       break;
            case 'C' : result = 100;
                       break;
            case 'D' : result = 500;
                       break;
            default: result = 1000;
        }
        return result;
    }
}

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }

