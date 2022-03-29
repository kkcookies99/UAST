 class Solution {
public:
    bool XXX(string s) {
        //应用栈的思想
        if(s.length()<=0)
        {
            return 1;
        }
        if(s.length()==1)
        {
            return 0;
        }
        string::iterator iter=s.begin();
        string str;
        str.push_back(*iter);
        iter++;
        bool flag;
        while(iter<s.end())
        {
            if(*iter==')'||*iter==']'||*iter=='}')
            {
                flag = match(*iter,str);
                if(flag)
                {
                    //vecInt.pop_back(); // 删除最后一个元素
                    str.pop_back();
                    iter++;
                }
                else 
                    return 0;
            }
            else 
            {
                str.push_back(*iter);
                iter++;
            }
        }
        if(str.size()==0)
        {
            return true;
        }
        else 
        {
            return 0;
        }
    }
    bool match(char ch,string s)
    {
        bool flag;
        switch(ch)
        {
            case ')':
                if(s[s.length()-1]=='(')
                    flag=true;
                else 
                    flag=false; 
                break;
            case ']':
                if(s[s.length()-1]=='[')
                    flag=true;
                else 
                    flag=false; 
                break;
            case '}':
                if(s[s.length()-1]=='{')
                    flag=true;
                else 
                    flag=false; 
                break;
            default:
                break;;
        }
        return flag;
    }
};

