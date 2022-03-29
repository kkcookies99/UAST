 public boolean XXX(String s) {
        char[] a = s.toCharArray();
	//新创建一个数组储存左括号
	char[] b = new char[a.length];
	//f记录左括号的个数
	//flag作为在没有左括号的情况下出现右括号的标识.
	int f = 0, flag = 0;
	for (int i = 0; i < a.length; i++) {
		//把左括号放入数组中,f记录最后一个放入的左括号的下标
		if ((a[i] == '(') || (a[i] == '{') || (a[i] == '[')) {
			b[f] = a[i];
			f++;
		} else if (f == 0) {//如果在没有做括号的情况下,出现了有括号
			//用flag进行标识
			flag = 1;
			//说明已经不是有效的括号表达式了,直接退出循环
			break;
			 // ')' - '(' == 1
			 // ']' - '[' == 2
			 // '}' - '{' == 2
			 // 如果字符差为1,或者2,则表示符合同类型左右括号.能匹配
		} else if ((a[i] - b[f - 1] == 1) || (a[i] - b[f - 1] == 2)) {
			//下标左移
			f--;
		} else {
			//否则匹配失败,领标识符flag=1,直接退出循环
			flag = 1;
			break;
		}
	}
	//循环结束之后,如果不匹配标识符flag没有被改变,并且
	//数组中为空(即所有括号都成对的匹配成功) 则表示是有效的括号
	if ((flag == 0) && (f == 0))
		return true;
	else
		return false;
}

