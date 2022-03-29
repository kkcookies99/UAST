 class Solution {
public:
    string XXX(int n) {
        if(n==1){
            return "1";
        }
        string str=XXX(n-1);
        string res;
        int c=1;
        for(int i=1;i<str.size();i++){
            if(str[i]!=str[i-1]){
                res.push_back('0'+c);
                res.push_back(str[i-1]);
                c=1;
            }
            else c++;
        }
        res.push_back('0'+c);
        res.push_back(str.back());
        return res;
    }
};

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


