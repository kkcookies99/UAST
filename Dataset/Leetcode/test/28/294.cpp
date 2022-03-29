 class Solution {
public:
    int XXX(string haystack, string needle) {
        if(needle=="")return 0;
	    int i = 0, j = 0;
        int *next = getNext(needle);
        int *nextval = getNextVal(needle,next);
        delete[] next;
	    while (i < haystack.size()){
		    if (j == -1||haystack[i] == needle[j]){i++;j++;}
		    else j = nextval[j];
            if (j == needle.size()){
                delete []nextval;
                return (i - j);
            }
	    }
	    return -1;
    }
    int* getNext(string s){
        int* next = new int[s.size()+1];
	    next[0] = -1;
	    int i = 0,j = -1;
	    while (i < s.size()) {
		    if (j == -1 || s[i] == s[j])next[++i] = ++j;
		    else j = next[j];
	    }
	    return next;
    }
    int* getNextVal(string s,int* next){
	    int* nextval = new int[s.size()+1];
	    nextval[0] = -1;
	    for (int i = 1; i < s.size()+1; i++){
		    if (s[next[i]] == s[i]) {
			    nextval[i] = nextval[next[i]];
		    }else nextval[i] = next[i];
	    }
	    return nextval;
    }
};

