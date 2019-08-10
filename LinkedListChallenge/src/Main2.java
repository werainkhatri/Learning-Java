import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        scanner.nextLine();
        for(int i = 0; i < t; i ++) { //test cases
            int n = scanner.nextInt();
            scanner.nextLine();
            String x = scanner.nextLine();
            for(int j = 0; j < n; j ++) { //letters
                char y = x.charAt(j);
                if(!Character.isAlphabetic(y))
                    System.out.print('C');
                else {
                    int c, d;
                    char ch;
                    if (y < 97) {
                        c = 65;
                        d = 90;
                        ch = 'A';
                    } else {
                        c = 97;
                        d = 122;
                        ch = 'a';
                    }
                    int ascii = c + (y - ch);
                    if (!isPrime(ascii)) {
                        int p = ascii, q = ascii;
                        for (int k = 0; k < 10; k++) {
                            if (q < d)
                                q++;
                            if (p > c)
                                p--;
                            if (isPrime(p) && isPrime(q)) {
                                ascii = p;
                                break;
                            } else if (isPrime(p)) {
                                ascii = p;
                                break;
                            } else if (isPrime(q)) {
                                ascii = q;
                                break;
                            }
                        }
                        System.out.print((char) (ch + (ascii - c)));
                    } else
                        System.out.print(y);
                }
            }
            System.out.println();
        }
    }

    public static boolean isPrime(int n) {
        boolean k = true;
        for(int i = 2; i < n; i ++) {
            if(n % i == 0)
                k = false;
        }
        return k;
    }
}
