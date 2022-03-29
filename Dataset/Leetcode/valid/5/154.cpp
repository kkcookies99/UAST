 class Solution {
public:
    string XXX(string s) {
        string str = "";
        
        for (int i = 0; i < s.size(); ++i)
        {
            int j = s.find(s[i], i + 1);
            
            while (j != -1)
            {
                int k = i,l = j;
                bool flag = true;
                while(k < l)
                {
                    if (s[++k] != s[--l])
                    {
                        flag = false;
                        break;
                    }  
                }
                if (flag && (j - i + 1) > str.size()) 
                    str = s.substr(i, j - i + 1);
                j = s.find(s[i], j + 1);
            }
        }
        
        if (str == "" && s.size() >= 1) 
            str += s[0]; 
        return str;
    }
};

