 class Solution {
public:
void getNext(string p,int *next)
{
	next[0]=-1;
	int i=0,j=-1;
	while(i<sizeof(p)-1&&j<sizeof(p)-1)
	{
      
		if(j==-1||p[i]==p[j])
		{
			i++;
			j++;
			next[i]=j;
		}
		else	j=next[j];
	}
}
int KMP(string t,string p)
{
	int i=0,j=0;
	int lt=t.size(),lp=p.size();
	int *next = new int[p.size()] ();
	getNext(p,next);
	while(j<lp&&i<lt)
	{		
		if(j==-1||t[i]==p[j])
		{
			i++;
			j++;
		}
		else	j=next[j];		
	}
	 if(j==p.size())	return i-j;
	 else return -1;
}
    int XXX(string haystack, string needle) {
        //haystack="mississippi";
        //needle="issip";
        if(needle.size()==0) return 0;
        if(haystack.size()==0) return -1;
        return  KMP(haystack,needle);
    }
};

