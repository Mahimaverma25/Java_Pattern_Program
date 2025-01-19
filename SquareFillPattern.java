// queation number 1
public class SquareFillPattern
{
     public static void main(String[] args) {
        int n = 4;//number of rows
        int m = 5;//number of coloms
        //outer loop
        for(int i=1; i<=n; i++){
            //inner loop
            for(int j =1; j<=m; j++){
                System.out.print("*");
            }
            System.out.println();
        }
 
    }
}
