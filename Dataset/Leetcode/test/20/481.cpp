 class Solution {
public:
    bool XXX(string s) {
    	stack<char> s1;
    	for(auto i=s.begin();i<s.end();i++)
    	{
    		if(*i=='('||*i=='['||*i=='{')
    			s1.push(*i);
    		else if(s1.empty()==1)
    		{
    			return 0;
    		}
    		else if(*i==')')
    		{
    			if(s1.top()!='(')return 0;
    			s1.pop();
    		}
    		else if(*i==']')
    		{
    			if(s1.top()!='[')return 0;
    			s1.pop();
    		}
    		else if(*i=='}')
    		{
    			if(s1.top()!='{')return 0;
    			s1.pop();
    		}
    	}
    	return s1.empty()?1:0;
    }
};

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


