public class Solution {
    public int LengthOfLongestSubstring(string s) {
            if (string.IsNullOrEmpty(s))
            {
                return 0;
            }

            if (s.Length < 2)
            {
                return 1;
            }

            int left = 0;
            int right = 1;
            int length = 1;
            char[] array = s.ToCharArray();

            while (right < array.Length)
            {
                if (array[left] != array[right])
                {
                    int i = left;
                    bool isRepeat = false;

                    while (i < right)
                    {
                        if (array[i] == array[right])
                        {
                            left++;
                            right = left + 1;
                            isRepeat = true;
                            break;
                        }
                        else
                        {
                            i++;
                        }
                    }

                    if (!isRepeat)
                    {
                        length = Math.Max(length, right - left + 1);
                        right++;
                    }
                }
                else
                {
                    left++;
                    right = left + 1;
                }
            }

            return length;
    }
}

