import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        boolean fi = false;
        Scanner scanner = new Scanner(System.in);
        char opcio = 0;
        while (fi != true){
                System.out.println("* * * * * * M E N U * * * * * *\n");
                System.out.println("===============================\n");
                System.out.println("A - [Ex. 23] Taula divisió entera\n");
                System.out.println("B - [Ex. 26] Fibonacci\n");
                System.out.println("C - [Ex. 01] Compta vocals\n");
                System.out.println("X - SORTIR");
                System.out.println("Tria una opció:");
                opcio = scanner.next().toUpperCase().charAt(0);
                if ((opcio >='A' && opcio <= 'C') || opcio == 'X'){
                    switch (opcio){
                        case 'A':
                            //codigo EX 23
                            boolean nombrecorrecte = false;
                            int valor = 0, resultat, residu;
                            while(nombrecorrecte == false){
                                //System.out.print("introdueix nombre natural: ");
                                try{
                                    valor = Integer.parseInt(scanner.nextLine());
                                    if (valor >0){
                                        nombrecorrecte = true;
                                    }

                                } catch (Exception e){

                                }
                            }


                            for (int i = 1; i <= 10; i++) {
                                resultat = valor/i;
                                residu = valor%i;
                                System.out.printf("%d / %d: quocient = %d i residu = %d\n", valor, i, resultat, residu);
                            }
                            break;


                        case 'B':
                            int valorB, suma1 = 1, suma2 = 1, resultatB;

                            valor = scanner.nextInt();

                            System.out.printf("%d %d ", suma1, suma2);
                            for (int i = 2; i < valor; i++) {
                                resultatB = suma1+suma2;
                                System.out.printf("%d ", resultatB);
                                suma1 = suma2;
                                suma2 = resultatB;

                            }
                            break;
                        case 'C':
                            String frase = "";
                            int vocals = 0;
                            char lletraactual;
                            scanner.nextLine();
                            frase = scanner.nextLine();
                            for (int i = 0; i < frase.length(); i++) {
                                lletraactual = frase.toLowerCase().charAt(i);
                                switch (lletraactual){
                                    case 'a':
                                    case 'e':
                                    case 'i':
                                    case 'o':
                                    case 'u':
                                        vocals++;
                                        break;
                                }
                            }
                            System.out.println(vocals);
                            break;
                        case 'X':
                            fi = true;
                            break;
                    }
                }
                else {
                    System.out.println("Opció incorrecta!\n");
                }
        }
    }
}
