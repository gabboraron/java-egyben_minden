import java.util.Scanner;

class Quadratic {
    public static void main(String[] args) {
        //beolvasas
        System.out.println("Ez egy ax^2 + bx + c formaájú egyenletet megoldó program!");
        System.out.println("Add meg a-t: ");
        Scanner scanner = new Scanner(System.in);
        int a = Integer.parseInt(scanner.nextLine());

        System.out.println("Add meg b-t: ");
        int b = Integer.parseInt(scanner.nextLine());
        
        System.out.println("Add meg c-t: ");
        int c = Integer.parseInt(scanner.nextLine());
        System.out.println("Az egyenlet igy nez ki: " + a +"x^2 + " + b + "x + " + c );

        //feldolgozas
        System.out.println("d= b^2 - 4*a*c " );
        int d = b*b - 4*a*c;
        System.out.println("d= " + d );

        //kiírás
        if (d>-1) {
            double x1 = ((-1) * (b+Math.sqrt(d)))/(2*a);
            double x2 = ((-1) * (b-Math.sqrt(d)))/(2*a);
            System.out.println(" ");
            System.out.println("A VALOS GYOKOK A KOVETKEZOK: ");
            System.out.println("x1= " + x1 );
            System.out.println("x2= " + x2 );
        }else {
            System.out.println("NINCS VALOS GYOK ");
        }
    }
}