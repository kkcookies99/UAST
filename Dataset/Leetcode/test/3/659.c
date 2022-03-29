 int XXX(char * s){
	char *j=s,*i=s,*d=s;
	int a = 0;
	while (*j != '\0')
	{
		j++;
		for (i = d; i < j; i++)  //每个字符都遍历一遍找出与之重复的字符
		{
			if (*j == *i)
			{
				if (j - d>a)  //没有重复字符的个数
				{
					a = j - d;
				}
				d = i + 1;  //d标记与*j重复字符的下下一个字符位置
				break;
			}
		}
	}
	if (j - d>a) //当整个字符串没有重复字符或字符串后面部分没有重复字符串时，求没有重复字符的个数
    {
		a = j - d;
	}
    return a;
}

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


