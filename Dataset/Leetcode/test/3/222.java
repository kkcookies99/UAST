 public int LengthOfLongestSubstring(string s)
    {
        var list = new List<char>();
        int i = 0;
        int sum = 0;
        while (!string.IsNullOrEmpty(s) && i < s.Length)
        {
            if (list.Contains(s[i]))
            {
                s = s.Substring(1,s.Length - 1);
                if (sum < list.Count) 
                {
                    sum = list.Count;
                }
                list = new List<char>();
                i = 0;
            }
            else 
            {
                list.Add(s[i]);
                i++;
            }
        }

        if (sum < list.Count) 
        {
            sum = list.Count;
        }
        return sum;
    }
