 class Solution {
public:
   string XXX(vector<string>& strs) {
       if(strs.empty()) return "";
       if(strs.size()==1) return strs[0];
       int n=strs.size();
       sort(strs.begin(),strs.end());
       int k=0;
       string s1=strs[0],s2=strs[n-1];
       while(k<s1.size() && k<s2.size()){
           if(s1[k]==s2[k])
               k++;
           else
               break;
       }
       return s1.substr(0,k);
   }
};


