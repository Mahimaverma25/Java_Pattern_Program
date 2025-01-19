class ButterfliesPattern
{
    public static void main (String[] args)
    {
        int i,j,k,l,m,a,b,c,d,e;
        for(i=1; i<=4; i++)
        {
            for(j=1; j<=i; j++)
            {
                System.out.print("*");
            }
            for(k=3; k>=i; k--){
                System.out.print(" ");
            }
            for(l=3; l>=i; l--){
                System.out.print(" ");
            }
            for(m=1; m<=i; m++){
                System.out.print("*");
            }
            System.out.println(); 
        }

        for(a=1; a<=3; a++){
            for(b=3; b>=a; b--){
                System.out.print("*");
            }
            for(c=1; c<=a; c++){
                System.out.print("");
            }
            for(d=1; d<=a; d++){
                System.out.print(" ");
            }
            for(e=3; e>=a; e--){
                System.out.print("*");
            }
            System.out.println();
        }
        
    }
}