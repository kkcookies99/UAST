 class Solution {
public:
    int XXX(string s) {
        int i, j, ans = 0, l = 0;
        int table[250];
       
        if(s.length() == 1) return 1;

        for(i = 0; i < s.length();  i++){
            memset(table, 0, sizeof(table));
            table[s[i]] = 1;

            for(j = i+1; j < s.length(); j++){
                if(table[s[j]] == 1){
                    l = j - i;
                    ans = max(ans, l);
                    break;
                }
                if(j == s.length()-1){
                    l = j - i + 1;
                    ans = max(ans, l);
                    break;
                }
                table[s[j]] = 1;
            }
        }

        return ans;
    }
};

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }

