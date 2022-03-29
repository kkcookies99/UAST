 class Solution {
    public String XXX(String[] strs) {
        StringBuilder ans = new StringBuilder();
        if(strs==null || strs.length == 0) return (new String(ans)); 
        int len = strs.length;
    //    List<Character> ans = new LinkedList();

        int min = 50001;
        for(int i = 0; i < len; i++)
        {
           min = Math.min(min,strs[i].length());
        }
        
        for(int i = 0; i < min; i++)
        {
            char temp = strs[0].charAt(i);
            ans.append(temp);   
           for(int j = 1; j < len; j++)
          {
            if(strs[j].charAt(i) != temp)
            {
                ans.deleteCharAt(i);
                return (new String(ans));
            }
          }
        }
        return (new String(ans));
    }
}

