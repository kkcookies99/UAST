 #define MAX_LEN 1024
static char ansStr[MAX_LEN] = { 0 };
static int longestChar = 0;

static void GetLongest(char *s, int start, int end)
{
    int sLen = strlen(s);
    int tmpLen = 0;
    while (0 <= start && start < sLen &&
        0 <= end && end < sLen) {
            if (s[start] != s[end]) {
                break;
            }
            tmpLen = end - start + 1;
            if (longestChar < tmpLen) {
                memset(ansStr, 0, sizeof(ansStr));
                strncpy(ansStr, s + start, tmpLen);
                longestChar = tmpLen;
            }
            start--;
            end++;
    } 
}

char * XXX(char *s)
{
    int i;
    int sLen = strlen(s);
    longestChar = 0;
    memset(ansStr, 0, sizeof(ansStr));

    for (i = 0; i < sLen; i++) {
        GetLongest(s, i, i);
        GetLongest(s, i, i + 1);
    }
    return ansStr;
}

