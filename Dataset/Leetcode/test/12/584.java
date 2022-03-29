 class Solution {
    public String XXX(int num) {
int arr[]= {1,4,5,9,10,40,50,90,100,400,500,900,1000};
//定义count数组，对应arr数组当前数的个数
int count[]=new int[arr.length];
int index=12;
String s="";
while(num!=0) {
	if(num<arr[index]) {
		index--;
		continue;
	}
	num-=arr[index];
	count[index]++;
	
}
for(int i=count.length-1;i>=0;i--) {
	if(count[i]!=0) {
		for(int j=0;j<count[i];j++) {
			if(i==12) {
				s+="M";
			}
			if(i==11) {
				s+="CM";
			}
			if(i==10) {
				s+="D";
			}
			if(i==9) {
				s+="CD";
			}
			if(i==8) {
				s+="C";
			}
			if(i==7) {
				s+="XC";
			}
			if(i==6) {
				s+="L";
			}
			if(i==5) {
				s+="XL";
			}
			if(i==4) {
				s+="X";
			}
			if(i==3) {
				s+="IX";
			}
			if(i==2) {
				s+="V";
			}
			if(i==1) {
				s+="IV";
			}
			if(i==0) {
				s+="I";
			}
		}
	}
}
return s;
    }
}

