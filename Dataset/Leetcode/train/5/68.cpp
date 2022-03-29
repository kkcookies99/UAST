 string XXX(string s) {
        string ss;
	int l = s.length();
        int u = 0,v = 0;
        int p,q;
        int maxe = 1;
        for(int i = 0;i<l;i++){
        	p = i;
        	q = i;
        	while(p>=0&&q<l){
        		if(s[p]==s[q]){
        			if(q-p+1>maxe){
        				maxe = q-p+1;
        				u = p;
        				v = q;
					}
				}
				else
					break;
				p--;
				q++;
			}
			p = i;
			q = i+1;
			if(p>=0&&q<l&&s[p]==s[q]){
				while(p>=0&&q<l){
	        		if(s[p]==s[q]){
	        			if(q-p+1>maxe){
	        				maxe = q-p+1;
	        				u = p;
	        				v = q;
						}
					}
					else
						break;
					p--;
					q++;
				}
			}
		}
	for(int i = u;i<=v;i++)
            ss.push_back(s[i]);
        return ss;
    }

