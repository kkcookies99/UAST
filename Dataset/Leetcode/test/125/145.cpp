 class Solution {
public:
    bool XXX(string s) {
        int left = 0, right = s.size() - 1;
        while(left<=right) {
            if((isalpha(s[right]) || isdigit(s[right])) && (isalpha(s[left]) || isdigit(s[left]))) {
                if(toupper(s[right]) == toupper(s[left])) {
                    right--;
                    left++;
                } else return false;
            } else {
                if(!isalpha(s[right]) && !isdigit(s[right])) right--;
                if(!isalpha(s[left]) && !isdigit(s[left])) left++;
            }

        }
        return true;
    }
    
};

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


