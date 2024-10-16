import java.util.Scanner;

class program{
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc=new Scanner(System.in);
        int low=sc.nextInt();
        int up=sc.nextInt();
        for(int i=low; i<=up; i++){
            int count=0;
            for(int j=2; j*j<=i; j++){
                if (i%j==0) {
                   count=count+1;
                   break;
                }
            }
            if(count==0){
                System.out.println(i);
            }
        }
    }
}