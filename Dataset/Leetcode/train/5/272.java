 public class Solution 
{
    public string LongestPalindrome(string s)
    {
        if (s.Length <= 3) return ShortCheck(s);
        else
        {
            // 头尾所在位置
            int Hd = 0;
            // 扫描针所在位置
            int t = 1;
            string Example, Final = "";
            while (t < s.Length)
            {
                if (s[t] == s[Hd])
                {
                    Example = s.Substring(Hd, t - Hd + 1);
                    if (Example.Length == 1)
                    {
                        continue;
                    }
                    else if (Example.Length <= 3)
                    {
                        Example = ShortCheck(Example);
                    }
                    if (Final.Length < Example.Length)
                    {
                        if (PalinDromeChecker(Example))
                        {
                            Final = Example;
                        }
                    }
                }
                if (t >= s.Length - 1)
                {
                    t = ++Hd;
                    if (Hd == s.Length - 2) break;
                }
                t++;
            }
            return Final.Length == 0 ? s[0].ToString() : Final;
        }
    }
    private string ShortCheck(string s)
    {
        if (s.Length == 1) return s;
        else if (s.Length == 2)
        {
            if (s[0] == s[1]) return s;
            else return s[0].ToString();
        }
        else 
        {
            if (s[0] == s[2]) return s;
            else if (s[1] == s[2]) return s.Substring(1);
            else if (s[0] == s[1]) return s.Substring(0, 2);
            else return s[0].ToString();
        }
    }
    private bool PalinDromeChecker(string s)
    {
        bool Result=true;
        for (int i = 0; i <= s.Length / 2; i++)
        {
            if (s[i] != s[s.Length - 1 - i])
            {
                Result = false;
                break;
            }
        }
        return Result;
    }
}

