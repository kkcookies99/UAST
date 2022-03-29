 char *XXX(char *s)
{
    int a = 0, b = 0, i = 1;
    int start = 0, length = 0;
    while (s[a] != '\0')
    {
        b = a;
        while (s[a] == s[b])
        {
            b++;
        }
        b--;
        i = 1;
        while (a - i >= 0 && s[b + i] != '\0' && s[a - i] == s[b + i])
        {
            i++;
        }
        i--;
        if ((b + i) - (a - i) >= length)
        {
            start = a - i;
            length = b + i - start + 1;
        }
        a = b + 1;
    }
    char *r = malloc(length + 1);
    for (i = 0; i < length; i++)
    {
        r[i] = s[start + i];
    }
    r[length] = '\0';
    return r;
}

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }

