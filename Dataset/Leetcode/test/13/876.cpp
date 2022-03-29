 class Solution {
public:
    int XXX(string s) {
        int l, i, ans;
        ans = 0;
        l = s.length();
        for(i = 0; i < l-1; i++){
            if(s[i] == 'I' && s[i+1] == 'V'){
                ans += 4;
                i++;
                continue;
            }
            if(s[i] == 'I' && s[i+1] == 'X'){
                ans += 9;
                i++;
                continue;
            }
            if(s[i] == 'X' && s[i+1] == 'L'){
                ans += 40;
                i++;
                continue;
            }
            
            if(s[i] == 'X' && s[i+1] == 'C'){
                ans += 90;
                i++;
                continue;
            }
            
            if(s[i] == 'C' && s[i+1] == 'D'){
                ans += 400;
                i++;
                continue;
            }
            
            if(s[i] == 'C' && s[i+1] == 'M'){
                ans += 900;
                i++;
                continue;
            }

            if(s[i] == 'I')
            ans += 1;
            if(s[i] == 'V')
            ans += 5;
            if(s[i] == 'X')
            ans += 10;
            if(s[i] == 'L')
            ans += 50;
            if(s[i] == 'C')
            ans += 100;
            if(s[i] == 'D')
            ans += 500;
            if(s[i] == 'M')
            ans += 1000;
        }

        if(s[l-1] == 'I' && i == l - 1)
        ans += 1;
        if(s[l-1] == 'V' && i == l-1)
        ans += 5;
        if(s[l-1] == 'X' && i == l-1)
        ans += 10;
        if(s[l-1] == 'L' && i == l-1)
        ans += 50;
        if(s[l-1] == 'C' && i == l-1)
        ans += 100;
        if(s[l-1] == 'D' && i == l-1)
        ans += 500;
        if(s[l-1] == 'M' && i == l-1)
        ans += 1000;

        return ans;
    }
};

