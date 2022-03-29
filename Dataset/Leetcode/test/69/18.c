int XXX(int x){
    for(int i=0; i<=46340; i++)
    {
        if(i*i == x)
            return i;
        else if(i!=46340 && i*i<x && (i+1)*(i+1)>x)
            return i;
        else if(i==46340)
            return 46340;
    }

    return 0;
}

