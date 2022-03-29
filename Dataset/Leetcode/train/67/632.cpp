class Solution {
public:
    string XXX(string a, string b) {
        string r;
        int i = a.length()-1, j=b.length()-1;
        bool isCarry = false;
        for(; i >=0 && j >= 0; i--,j--)
        {
            if(a[i] == '1' && b[j] == '1')
            {
                if(isCarry) r.insert(0, "1");
                else r.insert(0, "0");
                isCarry = true;
            }             
            else if((a[i] == '1' && b[j] == '0') || (a[i] == '0' && b[j] == '1')) 
            {
                if(isCarry) 
                {
                    r.insert(0, "0");
                    isCarry = true;
                }              
                else 
                {
                    r.insert(0, "1");
                    isCarry = false;
                }
            }
            else if (a[i] == '0' && b[j] == '0') 
            {
                if(isCarry) r.insert(0, "1");
                else r.insert(0, "0");
                isCarry = false;
            }
            
        }
        string temp = "";
        if(i < 0 && j >= 0) temp = b.substr(0, j+1);
        else if (i >= 0 && j < 0) temp = a.substr(0, i+1);
        for(int k = temp.length()-1; k>=0 ;k--)
        {
            if(temp[k] == '1')
            {
                if(isCarry)
                {
                    r.insert(0, "0");
                    isCarry = true;
                }
                else
                {
                    r.insert(0, "1");
                    isCarry = false;
                }
                
            } 
            else if(temp[k] == '0')
            {
                if(isCarry) r.insert(0, "1");
                else r.insert(0, "0");
                isCarry =   false;
            }
        }
        if(isCarry) r.insert(0,"1");
        return r;
    }
};

