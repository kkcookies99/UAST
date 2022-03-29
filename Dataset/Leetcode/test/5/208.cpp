 class Solution
{
public:
    string XXX(string s)
    {
        int mid = 0, right = 0, maxi = 0;
        /*字符串依次插入'|'，使得奇偶统一*/
        int size = s.length() * 2 + 1;
        string ps(size, '|');
        for (int i = 0; i < s.size(); ++i)
            ps[i * 2 + 1] = s[i];
        /*定义数组，记录以当前pos为中心点的有效半径*/
        vector<int> lens(size);

        /*遍历扩展字符串，吸收已知有效半径的基础上扩展有效半径*/
        for (int i = 0; i < ps.length(); ++i)
        {
            /*当前位置在半径内，取镜像位置或到右边界小值*/
            if (i < right)
                lens[i] = min(lens[mid - (i-mid)], right - i);
            else
                lens[i] = 0;
            /*扩展有效半径的左右位置，需要减去已知有效半径*/
            int l = i - lens[i] - 1;
            int r = i + lens[i] + 1;
            /*中心扩展*/
            while (l >= 0 && r <= ps.size() && ps[l] == ps[r])
            {
                l--;
                r++;
                lens[i]++;
            }
            /*如果有效半径右边界超出上个有效半径右边界，则更新中心点和右边界*/
            r = i + lens[i];
            if (r > right)
            {
                right = r;
                mid = i;
            }
            /*记录最大有效半径的位置*/
            if (lens[maxi] < lens[i]) maxi = i;
        }
        /*因为字符串进行了扩展，实际有效长度等于有效半径，起始位置((pos-len+1)-1)/2*/
        return s.substr((maxi-lens[maxi])/2, lens[maxi]);
    }
};

