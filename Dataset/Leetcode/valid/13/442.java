 class Solution {
    public int XXX(String s) {
        char[] ch = s.toCharArray();
        int num = 0;
        for(int i = 0; i < ch.length; i++){
            if(i < ch.length - 1){
               if(ch[i] == 'I' && ch[i + 1] == 'V'){
                num += 4;
                i++;
                continue;
            }
            if(ch[i] == 'I' && ch[i + 1] == 'X'){
                num += 9;
                i++;
                continue;
            }
            if(ch[i] == 'X' && ch[i + 1] == 'L'){
                num += 40;
                i++;
                continue;
            }
            if(ch[i] == 'X' && ch[i + 1] == 'C'){
                num += 90;
                i++;
                continue;
            }
            if(ch[i] == 'C' && ch[i + 1] == 'D'){
                num += 400;
                i++;
                continue;
            }
            if(ch[i] == 'C' && ch[i + 1] == 'M'){
                num += 900;
                i++;
                continue;
            }
            }
            if(ch[i] == 'M'){
                num += 1000;
            }
            if(ch[i] == 'D'){
                num += 500;
            }
            if(ch[i] == 'C'){
                num += 100;
            }
            if(ch[i] == 'L'){
                num += 50;
            }
            if(ch[i] == 'X'){
                num += 10;
            }
            if(ch[i] == 'V'){
                num += 5;
            }
            if(ch[i] == 'I'){
                num += 1;
            }
        }
        return num;
    }
}

