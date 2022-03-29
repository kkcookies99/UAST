 class Solution {
public:
    int XXX(string s) {
        replace_all_distinct(s,"IV","a");
        replace_all_distinct(s,"IX","b");
        replace_all_distinct(s,"XL","c");
        replace_all_distinct(s,"XC","d");
        replace_all_distinct(s,"CD","e");
        replace_all_distinct(s,"CM","f");
        int res[13]={1,4,5,9,10,40,50,90,100,400,500,900,1000};
        char roman[13]={'I', 'a','V','b','X','c','L','d','C','e','D','f','M'};
        int ans=0;
        for(int i=0;i<s.length();i++)
            for(int j=12;j>=0;j--)
                if(roman[j]==s[i]) 
                    ans+=res[j];
        return ans;
    }
    string& replace_all_distinct(string& str, const string& old_value, const string& new_value)
    {
        string::size_type pos=0;
        while((pos=str.find(old_value,pos))!= string::npos)
        {
            str=str.replace(pos,old_value.length(),new_value);
            if(new_value.length()>0)
            {
                pos+=new_value.length();
            }
        }
        return str;
    }
};

