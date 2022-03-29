class Solution {
public:
    int XXX(string s) {
        int sum = 0;
        for(int i = 0; i < s.length(); i++){
            if(s[i] == 'I'){
                if(i + 1 < s.length()){
                    if(s[i + 1] == 'V' || s[i + 1] == 'X'){
                        if(s[i + 1] == 'V'){
                            sum += 4;
                            i++;
                        }else{
                            sum += 9;
                            i++;
                        }
                    }else{
                        sum += 1;
                    }
                }else{
                    sum += 1;
                }
            }else if(s[i] == 'V'){
                sum += 5;

            }else if(s[i] == 'X'){
                if(i + 1 < s.length()){
                    if(s[i + 1] == 'L' || s[i + 1] == 'C'){
                        if(s[i + 1] == 'L'){
                            sum += 40;
                            i++;
                        }else{
                            sum += 90;
                            i++;
                        }
                    }else{
                        sum += 10;
                    }
                }else{
                    sum += 10;
                }

            }else if(s[i] == 'L'){
                sum += 50;

            }else if(s[i] == 'C'){
                if(i + 1 < s.length()){
                    if(s[i + 1] == 'D' || s[i + 1] == 'M'){
                        if(s[i + 1] == 'D'){
                            sum += 400;
                            i++;
                        }else{
                            sum += 900;
                            i++;
                        }
                    }else{
                        sum += 100;
                    }
                }else{
                    sum += 100;
                }

            }else if(s[i] == 'D'){
                sum += 500;

            }else if(s[i] == 'M'){
                sum += 1000;
            }else{
                continue;
            }
        }
        return sum;
    }
};

