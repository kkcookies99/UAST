 class Solution {
public:
    int XXX(string s) {
        int i = 0;
        int sum = 0;
        while (i != s.size())
        {
            if (s[i] == 'M' && i == 0)
            {
                sum += 1000;
                i++;
            }
            else if (s[i] == 'M' && s[i - 1] == 'C')
            {
                sum += 800;
                i++;
            }
            else if (s[i] == 'M')
            {
                sum += 1000;
                i++;
            }
            else if (s[i] == 'D' && i == 0)
            {
                sum += 500;
                i++;
            }
            else if (s[i] == 'D' && s[i - 1] == 'C')
            {
                sum += 300;
                i++;
            }
            else if (s[i] == 'D')
            {
                sum += 500;
                i++;
            }
            else if (s[i] == 'C' && i == 0)
            {
                sum += 100;
                i++;
            }
            else if (s[i] == 'C' && s[i - 1] == 'X')
            {
                sum += 80;
                i++;
            }
            else if (s[i] == 'C')
            {
                sum += 100;
                i++;
            }
            else if (s[i] == 'L' && i == 0)
            {
                sum += 50;
                i++;
            }
            else if (s[i] == 'L' && s[i - 1] == 'X')
            {
                sum += 30;
                i++;
            }
            else if (s[i] == 'L')
            {
                sum += 50;
                i++;
            }
            else if (s[i] == 'X' && i == 0)
            {
                sum += 10;
                i++;
            }
            else if (s[i] == 'X' && s[i - 1] == 'I')
            {
                sum += 8;
                i++;
            }
            else if (s[i] == 'X')
            {
                sum += 10;
                i++;
            }
            else if (s[i] == 'V' && i == 0)
            {
                sum += 5;
                i++;
            }
            else if (s[i] == 'V' && s[i - 1] == 'I')
            {
                sum += 3;
                i++;
            }
            else if (s[i] == 'V')
            {
                sum += 5;
                i++;
            }
            else
            {
                sum += 1;
                i++;
            }
        }
        return sum;
    }
};

