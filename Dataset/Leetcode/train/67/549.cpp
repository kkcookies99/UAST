class Solution {
public:
    stack<char> s1;
    string XXX(string a, string b) {
        int max_a=a.length()-1,max_b=b.length()-1;
        int i=max_a,j=max_b;
        int jin=0;
        int ta,tb;
        while(i>=0||j>=0||jin!=0)
        {
            ta=0;tb=0;
            if(i>-1)ta=a[i]-'0';
            if(j>-1)tb=b[j]-'0';
            int sum=ta+tb+jin;
            if(sum>=2)
            {
                sum-=2;
                jin=1;
            }
            else jin=0;
            s1.push(sum+'0');
            i--;
            j--;
        }
        cout<<jin;
        string c="";
        while(!s1.empty())
        {
            c+=s1.top();
            s1.pop(); 
        }
       return c;
    }
};

