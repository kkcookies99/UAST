class Solution {
public:
    bool XXX(int x) {
        stack<int> num;
        string  s;
        if( x < 0 || ( x%10 == 0 && x != 0 )
            return false;      
        while( x!= 0 ) {
            num.push( x%10 );
            x /= 10;
        }
        while( !num.empty() ) {
            char tmp = num.top() + '0';
            s.push_back( tmp );
            num.pop();
        }
        int size = s.size();
        std::cout << size;
        return judge( s, 0, size-1 );
    }
    bool judge( string &s, int l, int r ) {
        int L = l;
        int R = r;
        while( L <= R && s[L] == s[R] ) {
            L++;
            R--;
        }
       
        if( L <= R)
            return false;
        else 
            return true;
    }
};

