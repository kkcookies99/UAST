 char *XXX(char *s)
{
    char *result = NULL;
    int max = 0, i = 0, j = 0, left = 0, right = 0;

    while('\0' != s[i])
    {
        /* 以s[i]为单中心，往两侧延申，看有没有更长的回文串。
        因为字符串最终有个结束符'\0'，所以只需要判断左边下标大于等于0，右侧在达到结束符时，必然s[i + j] == '\0'，就不满足s[i - j] == s[i + j]了，不用担心右侧越界。 */
        j = 1;
        while((0 <= i - j) && (s[i - j] == s[i + j]))
        {
            j++;
        }
        if((j << 1) - 1 > max)
        {
            max = (j << 1) - 1;
            left = i - j + 1;
            right = i + j - 1;
        }
        if('\0' == s[i + j])
        {
            break;
        }
        /* 如果s[i] == s[i + 1]，s[i + 1]必然不是结束符，以双中心继续往两侧延申，同上，不必担心右侧越界。 */
        if(s[i] == s[i + 1])
        {
            j = 1;
            while((0 <= i - j) && (s[i - j] == s[i + j + 1]))
            {
                j++;
            }
            if((j << 1) > max)
            {
                max = j << 1;
                left = i - j + 1;
                right = i + j;
            }
            if('\0' == s[i + j + 1])
            {
                break;
            }
        }
        i++;
    }

    /* 实际范围是s[left] ~ s[right]，多出一位作结束符。
     节省一半循环操作，因为是回文子串，所以左右同时开始赋值。 */
    result = (char *)malloc(sizeof(char) * (right - left + 2));
    i = 0;
    j = right - left;
    result[j + 1] = '\0';
    while(i <= j)
    {
        result[i] = s[i + left];
        result[j] = result[i];
        i++;
        j--;
    }

    return result;
}

