 class Solution {
public:
    string XXX(vector<string>& strs) {
        if(strs.size()==0){return "";}
        string pref="";
        string str=strs[0];
        int index=0;
        for(int i=0;;){
            if(strs.size()<=i){index++;i=0;}
            if(strs[i].size()<=index){break;}
            char tmp=strs[i][index];
            if(tmp!=str[index]){break;}
            i++;
            if(i>=strs.size()){pref.push_back(tmp);}
        }
        return pref;
    }
};

