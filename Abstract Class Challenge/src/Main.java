import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        System.out.println("".compareTo("a"));
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        in.nextLine();
        String[] nq = in.nextLine().split(" ");
        int n = Integer.parseInt(nq[0]);
        int q = Integer.parseInt(nq[1]);
        String[][] teams = new String[n][3];
        for(int i = 0; i < n*3; i ++) {
            String[] x = in.nextLine().split(" ");
            int pst = Integer.parseInt(x[0])-1;
            if(x[2].equals("Y")) {
                teams[pst][0] = x[1];
//                    System.out.println("0:" + names[0]);
            }
            else if(teams[pst][1] == null) {
                teams[pst][1] = x[1];
//                    System.out.println("1: " + names[1]);
            }
            else {
                if(x[1].compareTo(teams[pst][1]) < 0) {
                    String tt = teams[pst][1];
                    teams[pst][1] = x[1];
                    teams[pst][2] = tt;
//                        System.out.println("1:" + name + " 2: " + tt);
                }
                else {
                    teams[pst][2] = x[1];
//                        System.out.println("2: " + name);
                }
            }
        }

        for(int j = 0; j < q; j++) {
            String[] x = in.nextLine().split(" ");
            System.out.println(teams[Integer.parseInt(x[0])-1][Integer.parseInt(x[1])-1]);
        }
//        1
//        2 4
//        1 mayank N
//        2 prafull N
//        1 mihir N
//        2 bhoomi Y
//        1 abhishek Y
//        2 piyush N



















//        int c = Integer.parseInt(s);
//        MyLinkedList list = new MyLinkedList(null);
//        list.traverse(list.getRoot());
//
//        String s = "7 9 4 6 1 3 5 2 8";
//        String[] data = s.split(" ");
//        for(String i: data) {
//            list.addItem(new Node(i));
//        }
//        list.traverse(list.getRoot());
//        list.removeItem(new Node("0"));
//        list.traverse(list.getRoot());
//        list.removeItem(new Node("3"));
//        list.traverse(list.getRoot());
    }
//        Scanner scanner = new Scanner(System.in);
//        String a = scanner.nextLine();
//        String[] x = a.split(" ");
//        int n = Integer.parseInt(x[0]);
//        int d = Integer.parseInt(x[1]);
//
//        String b = scanner.nextLine();
//        x = b.split(" ");
//        int p = 0;
//        for(int i = 0; d + i < x.length; i++) {
//            double y;
//            double[] numbers = new double[d];
//            for(int j = 0; j < d; j ++) {
//                numbers[j] = Double.parseDouble(x[j + i]);
//            }
//            Arrays.sort(numbers);
//            if(d % 2 != 0) { //odd
//                y = numbers[(d-1)/2];
//                if(Double.parseDouble(x[d+i]) >= (2*y))
//                    p++;
//            } else { //even
//                y = (numbers[d/2] + numbers[d/2 - 1]) / 2;
//                if(Double.parseDouble(x[d+i]) >= (2*y))
//                    p++;
//            }
//        }
//        System.out.println(p);
}
//System.out.println(y + " : " + Double.parseDouble(x[d + i]));