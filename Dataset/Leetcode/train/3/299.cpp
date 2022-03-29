 class Solution {
public:
    int XXX(string s) {
        string time="";
        int len=0;
        for(int i=0;i<s.length();i++){
            int key=time.find(s[i]);
            if(key!=time.npos)
                time.assign(time,key+1,time.length()-key);
            time+=s[i];
            len=time.length()>len ? time.length():len;
        }
        return len;
    }
};

