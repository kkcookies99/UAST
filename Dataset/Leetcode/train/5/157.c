 #define _CRT_SECURE_NO_WARNINGS 0
#include<stdio.h>
#include<string.h>

	//p1指向字符串"abcd"的首地址, 而不是把"abcd"拷贝到malloc开辟的内存块中

int isPalindrome(char* s, int begin, int end);
char* XXX(char* s)
{
	int begin = 0;
	int end;
	int len = strlen(s) - 1;
	char result[1001];
	int maxlen = 0;
	if (s[0] == '\0')
	{
		result[0] = "";
	}
	else
	{
		for (begin = 0; begin<len; begin++)
		{
			for (end = len; end >= begin; end--)
			{
				if (isPalindrome(s, begin, end) == 1)
				{
					if ((end - begin + 1)>maxlen)
					{
						maxlen = (end - begin + 1);
						strncpy(result, s + begin, maxlen);
						result[maxlen] = '\0';
					}
					else {}
					break;
				}
				else {}
			}
		}
	}

	return result;
}

int isPalindrome(char* s, int begin, int end)
{
	int i, j;
	i = begin;
	j = end;
	while (i <= j)
	{
		if (s[i] == s[j])
		{
			i++;
			j--;
		}
		else
		{
			return 0;
		}
	}
	return 1;
}
void main()
{
	char s[] = "cbbd";
	//	char s = "babad";
	//   s指向字符串"abcd"的首地址, 而不是把"abcd"拷贝到malloc开辟的内存块中
	char* p = XXX(s);
	printf("%s\n", p);
	system("pause");
}

