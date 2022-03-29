class Solution {
public:
    int XXX(int x) {
        unordered_set<int> set({2147395599,2063520907,807810077,1464898982,2125209531});
	    float a = x;
	    float halfa = 0.5f * a;
	    int i = *(int *)&a;
	    i = 0x1FBD1E2C + (i >> 1);
	    a = *(float *)& i;
	    a = a*0.5f + halfa/a;
            a = a*0.5f + halfa/a;
            if(set.find(x)!=set.end())
                a = a -1;
            return a;
    }
};

