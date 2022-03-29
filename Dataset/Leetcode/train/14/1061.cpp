 class Solution {
public:
    string XXX(vector<string>& strs) {
        if(strs.size()==0)
            return "";
        int minlen=1000;
        for(int i=0;i<strs.size();++i)
            if(minlen>strs[i].size())
                minlen=strs[i].size();
        for(int i=0;i<minlen;++i){
            char c=strs[0][i];
            for(int j=1;j<strs.size();++j)
                if(strs[j][i]!=c)
                    return strs[0].substr(0,i);
        }
        return strs[0].substr(0,minlen);
    }
};

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


