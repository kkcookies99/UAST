class Solution {
public:
    int XXX(string s) {
        int n=s.size(),ptr1=n-1,ptr2=n-1;
        while(s[ptr1]==' ') ptr1--;
        ptr2=ptr1;
        while(ptr1>=0&&s[ptr1]!=' '){
            ptr1--;
        }

        return ptr2-ptr1;
    }
};

