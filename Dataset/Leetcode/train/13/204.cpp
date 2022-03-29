class Solution {
public:
    int XXX(string s) {
        int sum = 0;
        int l = s.size();
        for(int i=0;i<l;i++){
                if(s[i] == 'I'){
                        if(i+1 < l && (s[i+1] == 'V' || s[i+1] == 'X')){
                                sum = sum - 1;
                                continue;
                        }
                        sum = sum + 1;
                }
                if(s[i] == 'X'){
                        if(i+1 < l && (s[i+1] == 'L' || s[i+1] == 'C')){
                                sum = sum - 10;
                                continue;
                        }
                        sum = sum + 10;
                }
                if(s[i] == 'C'){
                        if(i+1 < l && (s[i+1] == 'D' || s[i+1] == 'M')){
                                sum = sum - 100;
                                continue;
                        }
                        sum = sum + 100;
                }
                if(s[i] == 'V')
                        sum = sum + 5;
                if(s[i] == 'L')
                        sum = sum + 50;
                if(s[i] == 'D')
                        sum = sum + 500;
                if(s[i] == 'M')
                        sum = sum + 1000;
        }
        return sum;
    }
};

