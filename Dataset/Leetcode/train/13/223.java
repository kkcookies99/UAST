class Solution {
    public int XXX(String s) {
        HashMap<String, Integer> map =new HashMap<>();
        map.put("M", 1000);
        map.put("CM", 900);
        map.put("D", 500);
        map.put("CD", 400);
        map.put("C", 100);
        map.put("XC", 90);
        map.put("L", 50);
        map.put("XL", 40);
        map.put("X", 10);
        map.put("IX", 9);
        map.put("IV", 4);
        map.put("V", 5);
        map.put("I", 1);
        int sum = 0;
        for(int i = 0; i < s.length(); i++)
        {          
            if(i + 1 < s.length())
            {
                if(map.containsKey(s.substring(i, i + 2)))
                {
                    sum = sum + map.get(s.substring(i, i + 2));
                    i++;
                }
                else
                {
                    sum = sum + map.get(s.substring(i, i + 1));
                }
            }
            else
                sum = sum + map.get(s.substring(i, i + 1));                   
        
        }
        return sum;
    }
}

