class Solution {
public:
    string XXX(int n) 
    {
        string res, temp;
        if (n == 1) res = "1";
        if (n == 2) res = "11";
        if (n == 3) res = "21";
        if (n == 4) res = "1211";
        if (n == 5) res = "111221";
        else if (n >= 6)
        {   
            int count = 1;
            res=XXX(n-1);
            for (int i = 0; i < res.size()-1; i++)
            {
                if (res[i] == res[i+1])
                {
                    count++;
                    //cout << "count=" << count <<endl;
                }
                else
                {
                    temp.push_back(char(count+48));
                    temp.push_back(res[i]);
                    //cout << "count ==" << count <<endl;
                    //cout << "res[" << i << "]==" << res[i] <<endl;
                    count = 1;
                }
            }
            temp.push_back(char(count+48));
            temp.push_back(res[res.size()-1]);
            //cout << "count ==" << count <<endl;
            //cout << "res[" << res.size()-1 << "]==" << res[res.size()-1] <<endl;
            res = temp;
            //cout << "temp ==" << temp <<endl;
        }
        return res;
    }
};

