class Solution {
    public:
    int XXX(int x) {
        string final_ans;
        if(x==0) return 0;
        else if(x>0){
            string s = to_string(x);
            string _ans;
            string ans;
            // 翻转
            for(auto it=s.rbegin();it!=s.rend();it++)    _ans.push_back(*it);
            // 去 零
            if(!_ans.empty() && _ans[0]=='0'){
                int i;
                for(i=0;;i++){
                   if(_ans[i]!='0') break; 
                } 
                ans = _ans.substr(i,_ans.size()-1); 
            }
            else 
                ans = _ans;
            char str[20]={0};
            string __t;
            sprintf(str,"%*s",10,ans.data());
            __t = str;
            if(__t > "2147483647") return 0;
            final_ans = ans;
        }
        else if(x<0){
            string s = to_string(x);
            string temp = s.substr(1,s.size()-1);
            string _ans;
            string ans;
            // 翻转
            for(auto it=temp.rbegin();it!=temp.rend();it++)    _ans.push_back(*it);
            // 去 零
            if(!_ans.empty() && _ans[0]=='0'){
                int i;
                for(i=0;;i++){
                   if(_ans[i]!='0') break; 
                } 
                ans = _ans.substr(i,_ans.size()-1); 
            }
            else 
                ans = _ans;
            char str[20]={0};
            string __t;
            sprintf(str,"%*s",10,ans.data());
            __t = str;
            if(__t > "2147483648") return 0;
            final_ans = "-" + ans;
        }
        return atoi(final_ans.data());            
    }
};


