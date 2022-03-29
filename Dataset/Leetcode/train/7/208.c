int XXX(int x) {
    int y=0;
	while(x!=0){
		if(x>0 && y<=(INT_MAX-x%10)/10 || x<0 && y>=(INT_MIN-x%10)/10)
			y=y*10 + x%10;
		else
			return 0;
		x/=10;
	}
	return y;
}

