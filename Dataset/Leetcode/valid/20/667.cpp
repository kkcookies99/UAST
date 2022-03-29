 class Solution {
public:
    bool XXX(string s) {
      if (s.size() % 2) 
        return false;
      GetMatchScope(s,0,false);
      return is_valid;
    }

    int GetMatchScope(string str,int index,bool is_matching){
    //   std::cout<<index<<":"<<1<<endl;
      if(index >= str.size() || !is_valid )
        return -1;
       
      if(left.find(str[index],0)!=std::string::npos){
        int res = GetMatchScope(str,index+1,true);
        if(res!=-1&&IsMatch(str[index],str[res])){
          return GetMatchScope(str,res+1,is_matching);
        }
        else {
          is_valid = false;
          return str.size();
        }
      }

      if(right.find(str[index])!=std::string::npos){
        if(!is_matching) //并表示先匹配到右括号
          is_valid=false;
        return index;
      }

      is_valid=false;
      return -1;
    }
    bool IsMatch(char l,char r){
        switch(l){
            case '(':
              return r==')';
            case '{':
              return r=='}';
            case '[':
              return r==']';
            default:
              return false;
        }
        return false;
    }
    bool is_valid = true;
    std::string  left="({[";
    std::string  right=")]}";
};


