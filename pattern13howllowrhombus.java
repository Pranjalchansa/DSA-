public class pattern13howllowrhombus {
    public static void main(String[] args) {
        //4space 1star 3space 1 star
        //3space 1star 3space 1 star
        //2space 1star 3space 1 star
        //1space 1star 3space 1 star
        //0space 1star 3space 1 star
        int n =5;
        for(int i =1; i<=n ;i++)
        {
            for(int j=1 ; j<=n-i ; j++)
            {
                System.out.print(" ");
            }
            for(int j=1 ; j<=n ; j++)
            {
                if(i==1 || i==n || j==1 ||j==n)
                {
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
