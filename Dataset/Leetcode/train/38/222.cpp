class Solution {
public:
    string XXX(int n) {
        string d="1";
        for(int cnt=1;cnt<n;cnt++)
        {
            string next;
            for(int i=0;i<d.length();)
            {
                int j=i+1;
                while(j<d.length()&&d[j]==d[i])
                    j++;
                next+=to_string(j-i)+d[i];
                i=j;
            }
            d=next;
        }
        return d;
    }
};

