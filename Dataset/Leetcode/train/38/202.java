class Solution {
    public String XXX(int n) {
        if(n==1)
            return "1";
        List<Character> ans=new ArrayList();
        List<Character> tmp=new ArrayList();
        ans.add('1');
        for(int i=2;i<=n;i++)
        {
            int left=0;
            int right=0;
            int count=0;
            while(right<ans.size())
            {
                while(right<ans.size()&&ans.get(left)==ans.get(right))
                {
                    count++;
                    right++;
                }
                char a=(char)('0'+count);
                tmp.add(a);
                tmp.add(ans.get(left));
                left=right;
                if(right==ans.size())
                    break;
                count=0;
            }
            ans=new ArrayList(tmp);
            tmp.clear();
        }
        char[] res=new char[ans.size()];
        for(int i=0;i<res.length;i++)
            res[i]=ans.get(i);
        return String.valueOf(res);
    }
}

