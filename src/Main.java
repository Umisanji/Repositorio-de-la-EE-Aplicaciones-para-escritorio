import java.util.Scanner;

public class Main {
        public static void main(String[] args) {
            Scanner lector = new Scanner(System.in);
            Urna miUrna = new Urna();
            int votoIntegresado;

            System.out.println("SISTEMA DE VOTACION");
            System.out.println("Ingrese el numero del candidato o '0' para finalizar");

            do {
                System.out.println("voto para el candidato: ");
                while (!lector.hasNextInt()) {
                    System.out.println("Error: ingrese un numero valido");
                    lector.next();
                }
                
                votoIntegresado = lector.nextInt();

                if (votoIntegresado > 0) {
                        miUrna.votar(votoIntegresado);
                } else if (votoIntegresado < 0) {
                        System.out.println("los numeros negativos no son validos");
                    }
                    
            } while (votoIntegresado != 0);
            
            miUrna.MostrarResultados();
            lector.close();
        }

 }
        
