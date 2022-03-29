 class Solution {
public:
    string XXX(string s) {
        int length = s.length();
        bool table[1000][1000];
        int sol[1000][1000];
        int start = 0, end = 0;
        int max = 1;
        memset(sol,0,sizeof(sol));
        memset(table,false,sizeof(table));
        for(int i = 0; i < length; i++){
            table[i][i] = true;
            sol[i][i] = 1;
        } 

        for(int i = length - 2; i >=0; i--){
            for(int j = length - 1; j > i; j--){
                if(j - i == 1){
                    if(s[i] == s[i+1]) {
                        table[i][i+1] = true;
                        sol [i][i+1] = 2;
                        if(max < 2){
                            start = i;
                            end = i+1;
                            max = 2;
                         }
                    }
                }
                else if(table[i+1][j-1] && s[i] == s[j]){
                    table[i][j] = true;
                    sol[i][j] = sol[i+1][j-1] + 2;
                    if(max < sol[i][j]){
                        start = i;
                        end = j;
                        max = sol[i][j];
                    }
                } 
            }
        }
        return s.substr(start,end-start+1);
    }
};

