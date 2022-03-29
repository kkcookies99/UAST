 char * XXX(char * a, char * b){

	int a_size = strlen(a);
	int b_size = strlen(b);
	char *c;
	int f = 0; //最终进位标志

	if(b_size < a_size){
		c = (char *)malloc(a_size*sizeof(char));
		memset(c, 0, a_size);
		memcpy(&c[a_size - b_size], b, b_size);
	}
	else if(b_size >= a_size){
		c = (char *)malloc(b_size*sizeof(char));
		memset(c, 0, b_size);
		memcpy(&c[b_size - a_size], a, a_size);
	}

	int tem = 0;
	if(b_size < a_size){  //a + c
		for(int i = a_size-1; i > 0; i--){

			tem = (a[i] - '0') + (c[i] - '0');
			switch(tem){
				case 0: c[i] = '0'; break;
				case 1: c[i] = '1'; break;
				case 2: c[i] = '0'; c[i-1]+= 1;  break;
				case 3: c[i] = '1'; c[i-1]+= 1;  break;
			};
		}
	}

	else if(b_size >= a_size){  //b + c
		for(int i = b_size-1; i > 0; i--){

			tem = (b[i] - '0') + (c[i] - '0');
			switch(tem){
				case 0: c[i] = '0'; break;
				case 1: c[i] = '1'; break;
				case 2: c[i] = '0'; c[i-1]+= 1;  break;
				case 3: c[i] = '1'; c[i-1]+= 1;  break;
			};
		}
	}

	if(b_size < a_size){
		tem = (a[0] - '0') + (c[0] - '0');
		switch(tem){
				case 0: c[0] = '0'; break;
				case 1: c[0] = '1'; break;
				case 2: c[0] = '0'; f = 1;  break;
				case 3: c[0] = '1'; f = 1;  break;
		};
	}

	else if(b_size >= a_size){
		tem = (b[0] - '0') + (c[0] - '0');
		switch(tem){
				case 0: c[0] = '0'; break;
				case 1: c[0] = '1'; break;
				case 2: c[0] = '0'; f = 1;  break;
				case 3: c[0] = '1'; f = 1;  break;
		};
	}

	if(f){
		char *d = (char *)malloc(sizeof(char) * strlen(c));
		d[0] = '1';
		memcpy(&d[1], c, strlen(c));
		return d;
	}
	else
		return c;

	return c;
}

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


