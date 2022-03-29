class Solution {
public:
        string XXX(int n) 
        {
                string ret("1");
                string temp;
                int i, cnt;
                
                while(--n)
                {
                        temp.clear();
                        i=0;		
                        while(i<ret.length())
                        {
                                for(cnt=1; i+cnt<ret.length() && ret.at(i)==ret.at(i+cnt); cnt++);
                                temp.append(to_string(cnt));
                                temp.append(ret.substr(i,1));
                                i+=cnt;
                        }
                        ret.clear();
                        ret.append(temp);
                }
                //cout<<"ret.size = "<<ret.size()<<endl;
                return ret;
        }
};

