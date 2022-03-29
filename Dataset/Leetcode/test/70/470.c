int XXX(int n){
    int a[1000],j=2;
    a[0]=1;
    a[1]=2;
    while (j<n)
    {
        a[j]=a[j-2]+a[j-1];
        j++;
    }
    return a[n-1];
}

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


