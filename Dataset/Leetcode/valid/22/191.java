 class Solution {
    public List<String> XXX(int n) {
        List<String> result=new ArrayList<String>();
        UpdateList(n, 0, 0, "", result);
        return result;
    }
    private void UpdateList(int n,int L,int R,String str,List<String> result)
    {
    	if(L==n && R==n)
    	{
    		result.add(str);
    		return;
    	}
    	if(L<n)    	
    		UpdateList(n,L+1,R,str+'(',result);
    	
    	if(R<n && L>R)
    		UpdateList(n,L,R+1,str+')',result);
    }
}

