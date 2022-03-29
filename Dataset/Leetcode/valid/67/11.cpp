 class Solution {
public:
    string XXX(string a, string b) {
        string res="";
        int k=0;
        if(a.empty()) return b;
        if(b.empty()) return a;
        while(!a.empty()&&!b.empty())
        {
            char pa=a[a.size()-1];
            char pb=b[b.size()-1];
            if(pa=='1'&&pb=='1')
            {
                if(k==0){
                res.push_back('0');
                k=1;
                }
                else res.push_back('1');
            
            }
            else if(pa=='0'&&pb=='0')
            {
                if(k==0)
                res.push_back('0');
                else
                {
                    res.push_back('1');
                    k=0;
                }
            }
            else
            {
                if(k==1) res.push_back('0');
                else res.push_back('1');
            }
            a.pop_back();
            b.pop_back();


        }
        while(!b.empty())
        {
            char pb=b[b.size()-1];
            if(k==0)
            res.push_back(pb);
            if(k==1)
            {
                if(pb=='1')
                res.push_back('0');
                else
                {res.push_back('1');k=0;}
            }
            b.pop_back();
        }
        while(!a.empty())
        {
            char pa=a[a.size()-1];
            if(k==0)
            res.push_back(pa);
            if(k==1)
            {
                if(pa=='1')
                res.push_back('0');
                else{res.push_back('1');k=0;}
            }
            a.pop_back();
        }
        if(k==1)
        {
            res.push_back('1');
        }
        reverse(res.begin(),res.end());
        return res;

    }
};
code block

