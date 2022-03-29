 var XXX = function(s) {
				// 预处理 删除字符串的前导空格
				var reg=/^\s*/;
				s=s.replace(reg,'');
				// 判断正负
				var flag=1;
				// 除遇到负号以外，均设为正
				var first=s.charAt(0);
				if(first=='-'){
					flag=-1;
					s=s.replace(first,'');
				}else if(first=="+"){
					s=s.replace(first,'');
				}
				var sum=0;
				//按照题意：遇到非数字终止
				var isNumber=true;
				var i=0;
				while(isNumber){
					
					// 所遍历的字符为数字
					if((s.charAt(i).charCodeAt()>=48)&&(s.charAt(i).charCodeAt()<=57)){
						// console.log(sum.toString());
						var max=2147483647;
						// 这里是最小值的绝对值
						var min=2147483648;
						var num=Number(s.charAt(i));
						if((flag>0)&&((sum>parseInt(max/10))||((sum==parseInt(max/10))&&num>7))){
							// sum小于214748364 num可以是任何个位数
							// sum等于214748364 num不可以大于7
							// sum大于214748364 溢出
							return flag*max;
						}
						if((flag<0)&&((sum>parseInt(min/10))||((sum==parseInt(min/10))&&(num>8)))){
							return flag*min;
						}
						sum=sum*10+num;
						// 若已经是最后一个字符 则不允许继续
						isNumber=(i==s.length-1)?false:true;
						i++;
					}else{
						// 非数字 终止循环
						isNumber=false;
					}
				}
				return sum*flag;
			};

