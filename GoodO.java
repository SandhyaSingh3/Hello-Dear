class GoodO{

public static void main(String[] args){
int n =2, x=6;
int value = pow(x,n);
System.out.println(value);
}

static int pow(int x, int n){
if (n==0) return 1;
else if(n%2==0)
return pow(x*x,n/2);
else return x*pow(x*x,(n-1)/2);

}

}

