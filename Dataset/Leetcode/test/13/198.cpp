class Solution {
public:
    int XXX(string s) {
        int p, q, re = 0;
        for(p = 0; p < s.size() - 1; ++p){
            if(p != s.size() - 1) q = p + 1;
            if(s[p] == 'I' && s[q] == 'V'){
                re += 4;
                p++;
                continue;
            }else
            if(s[p] == 'I' && s[q] == 'X'){
                re += 9;
                p++;
                continue;
            }else
            if(s[p] == 'I' && s[q] != 'V' && s[q] != 'X'){
                re++;
                continue;
            }else
            if(s[p] == 'V'){
                re += 5;
                continue;
            }else
            if(s[p] == 'X' && s[q] != 'L' && s[q] != 'C'){
                re += 10;
                continue;
            }else
            if(s[p] == 'X' && s[q] == 'L'){
                re += 40;
                p++;
                continue;
            }else
            if(s[p] == 'X' && s[q] == 'C'){
                re += 90;
                p++;
                continue;
            }else
            if(s[p] == 'L'){
                re += 50;
                continue;
            }else
            if(s[p] == 'C' && s[q] != 'D' && s[q] != 'M'){
                re += 100;
                continue;
            }else
            if(s[p] == 'C' && s[q] == 'D'){
                re += 400;
                p++;
                continue;
            }else
            if(s[p] == 'C' && s[q] == 'M'){
                re += 900;
                p++;
                continue;
            }else
            if(s[p] == 'D'){
                re += 500;
                continue;
            }else
            if(s[p] == 'M'){
                re += 1000;
                continue;
            }
        }
        if(*(s.end() - 2) != 'I'){
            char temp = *(s.end() - 1);
            switch(temp){
                case 'V': re += 5;break;
                case 'X': re += 10;break;
            }
        }
        if(*(s.end() - 2) != 'X'){
            char temp = *(s.end() - 1);
            switch(temp){
                case 'L': re += 50;break;
                case 'C': re += 100;break;
            }
        }
        if(*(s.end() - 2) != 'C'){
            char temp = *(s.end() - 1);
            switch(temp){
                case 'D': re += 500;break;
                case 'M': re += 1000;break;
            }
        }
        if(*(s.end() - 1) == 'I') re++;
        return re;
    }
};

