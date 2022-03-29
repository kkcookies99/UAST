     int XXX(const string &s) {
        int ret = 0;
        string sub;
        for (size_t i = 0; i < s.length(); ++i) {
            string::size_type pos = sub.find(s[i]);
            if ( pos == string::npos) {
                sub += s[i];
                ret = ret > sub.length() ? ret : sub.length();
            } else {	
                sub = sub.substr(pos + 1) + s[i];	
            }
        }
        return ret;
    }

