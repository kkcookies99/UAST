 class Solution {
public:
    bool XXX(string s) {
            std::string ss = "" ;
            int size = s.size() ;
            for ( int i  = 0 ; i < size ; i++ ) 
                if ( !ss.size() ) ss.push_back( s[i] ) ;
                else if ( ss.back()+1 == s[i] || ss.back()+2 == s[i]) ss.pop_back() ;
                else ss.push_back( s[i] ) ;
            return !ss.size() ;
    }
};
