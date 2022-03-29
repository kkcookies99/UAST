 class Solution {
public:
    int XXX(string s) {
        int count = 0;
        int n = s.size();
        if(n == 1){
            if(s[0] == 'I'){
                return 1;
            }
            else if(s[0] == 'V'){
                return 5;
            }
            else if(s[0] == 'X'){
                return 10;
            }
            else if(s[0] == 'L'){
                return 50;
            }
            else if(s[0] == 'C'){
                return 100;
            }
            else if(s[0] == 'D'){
                return 500;
            }
            else if(s[0] == 'M'){
                return 1000;
            }
        }
        for(int i = 0; i < n; i++){
            if(s[i] == 'I'){
                count+=1;
            }
            else if(s[i] == 'V'){
                count+=5;
            }
            else if(s[i] == 'X'){
                count+=10;
            }
            else if(s[i] == 'L'){
                count+=50;
            }
            else if(s[i] == 'C'){
                count+=100;
            }
            else if(s[i] == 'D'){
                count+=500;
            }
            else if(s[i] == 'M'){
                count+=1000;
            }
        }
        for(int i = 0; i < n - 1; i++){
            if((s[i] == 'I' && s[i + 1] == 'V') || (s[i] == 'I' && s[i + 1] == 'X')){
                count -= 2;
            }
            else if((s[i] == 'X' && s[i + 1] == 'L') || (s[i] == 'X' && s[i + 1] == 'C')){
                count -= 20;
            }
            else if((s[i] == 'C' && s[i + 1] == 'D') || (s[i] == 'C' && s[i + 1] == 'M')){
                count -= 200;
            }
        }
        return count;
    }
};

