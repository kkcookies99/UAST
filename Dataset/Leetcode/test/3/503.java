 class Solution {
    public int XXX(String s) {
        Queue<Character> temp = new LinkedList<>();
        int len = s.length();
        int max = 0;
        for (int i=0;i<len;i++)
        {
            if(!temp.contains(s.charAt(i)))
                temp.offer(s.charAt(i));
            else
               {
                   if(temp.size()>max)
                       max = temp.size();
                   while(temp.contains(s.charAt(i)))
                         temp.poll();
                   temp.offer(s.charAt(i));
               }
        }
        if (temp.size()>max)
            max = temp.size();
        return max;
}
}

