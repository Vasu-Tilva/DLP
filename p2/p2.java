import java.util.Scanner;

public class p2 {
public static void main (String[] args) {
    Scanner sc = new Scanner(System.in);
    int n=2;
    int states = 4;
    int is = 1;
    int rs = is;
    int as = 2;
    int c;

    System.out.println("Enter a String : ");
    String str = sc.nextLine();

    int arr[][] = {
                    {2,3},
                    {1,4},
                    {4,1},
                    {3,2}
    };

    for(int i=0; i<str.length(); i++){
        char ch = str.charAt(i);
        if(ch =='a'){
            c = 0;
        }else if(ch == 'b'){
            c = 1;
        }else{
            System.out.println("Invalid string");
            return;
        }

        rs = arr[rs-1][c];
    }

    if(rs == 2){
        System.out.println("Valid String");
    }else{
        System.out.println("Invalid String");
    }

}
}