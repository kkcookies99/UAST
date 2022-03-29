 class Solution {
public:
    string XXX(string a, string b) 
    {
        string result;
        int temp=0;
        int length_a=a.size(),length_b=b.size();
        if(a.size()!=b.size())
        {
          if(a.size()>b.size())
        {  
            reverse(b.begin(),b.end());
            for(int i=0;i<length_a-length_b;i++)
                b+='0';
            reverse(b.begin(),b.end());
        }
        else
        {
            reverse(a.begin(),a.end());
            for(int i=0;i<length_b-length_a;i++)
                a+='0';
            reverse(a.begin(),a.end());
        }  
        }
        
        string::reverse_iterator it_a=a.rbegin(),it_b=b.rbegin();
        while(it_a!=a.rend())
        {
            result+=((*it_a-48)+(*it_b-48)+temp)%2+48;
            if((*it_a-48)+(*it_b-48)+temp>=2)
                temp=1;
            else
               temp=0;
            it_a++;
            it_b++;
        }
        if(temp==1)   
            result+='1';
        reverse(result.begin(),result.end()); 
        
               return result;
    }
};

