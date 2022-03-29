 class Solution {
public:
    bool XXX(string s) {
      int len = s.length();
      if(s.empty() || len%2 == 1){return false;}
      stack<char> sck;
      for(int i = 0; i < len; i++){
        if(sck.empty() && (s[i] == ')' || s[i] == ']' || s[i] == '}')){return false;}
        if(s[i] == '('){sck.push(')');}
        else if(s[i] == '['){sck.push(']');}
        else if(s[i] == '{'){sck.push('}');}
        else if(!sck.empty()){
            if(s[i] == sck.top()){sck.pop();}
            else{return false;}
        }else{
            return false;
        }
      }
      return (sck.empty() == true);  
    }
};

