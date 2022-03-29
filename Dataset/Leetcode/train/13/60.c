int XXX(char * s){
    int nums[15] = {0};
                    //十进制：十六进制：二进制
    nums[9]  = 1;   //I:73:0X49:1001
    nums[6]  = 5;   //V:86:0X56:0110
    nums[8]  = 10;  //X:88:0X58:1000
    nums[12] = 50;  //L:76:0X4C:1011
    nums[3]  = 100; //C:67:0X43:0011
    nums[4]  = 500; //D:68:0X44:0100
    nums[13] = 1000;//M:77:0X4D:1101
    for(unsigned char i = 0;s[i] != '\0';i++) {
        if(nums[s[i] & 0xf] >= nums[s[i+1] & 0xf])
            nums[1] += nums[s[i] & 0xf];
        else
            nums[1] -= nums[s[i] & 0xf];
    }
    return nums[1];
}

