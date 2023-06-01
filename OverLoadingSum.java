public class OverLoadingSum 
{
    int ans;
    public void sum(int a,int b)
    {
        ans = a+b;
        System.out.println(ans);
    }    

    public void sum(int c,int d,int e)
    {
        ans = c+d+e;
        System.out.println(ans);
    }   

    public void sum(int f,int g,int h,int i)
    {
       ans = f+g+h+i;
       System.out.println(ans); 
    }   

    public void sum(int j,int k,int l,int m,int n)
    {
        ans = j+k+l+m+n;
        System.out.println(ans);
    }   

    public static void main(String[] args)
    {
        OverLoadingSum o= new OverLoadingSum();
        o.sum(10,20);
        o.sum(10, 20,30);
        o.sum(10, 20, 30,40);
        o.sum(10, 20, 30, 40,50);
    }
}
