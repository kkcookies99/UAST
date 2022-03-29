class Solution {
public:
    int XXX(string s) {
        int num = 0, n = s.size();
        for(int i = 0; i< n; i++){
            switch(s[i]){
                case 'M': num += 1000; break;
                case 'D': num += 500;  break;
                case 'C':{
                    if(i+1 < n && s[i+1] == 'M'){
                        num += 900;
                        i++;
                    }
                    else if(i+1 < n && s[i+1] == 'D'){
                        num += 400;
                        i++;
                    }
                    else num += 100;
                }break;
                case 'L': num += 50;  break;
                case 'X':{
                    if(i+1 < n && s[i+1] == 'C'){
                        num += 90;
                        i++;
                    }
                    else if(i+1 < n && s[i+1] == 'L'){
                        num += 40;
                        i++;
                    }
                    else num += 10;
                } break;
                case 'V': num += 5;  break;
                case 'I':{
                    if(i+1 < n && s[i+1]=='X'){
                        num += 9;
                        i++;
                    }
                    else if(i+1 < n && s[i+1] == 'V'){
                        num += 4;
                        i++;
                    }
                    else num += 1;
                } break;
            }
        }
        return num;
    }
};

