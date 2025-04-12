package ui;

import java.util.Scanner; // Importar Scanner
import model.Controller;
import model.MatrizNumerica;


public class Executable {

    //private Scanner reader;
    private Controller cont;
    private Scanner escaner; // Ponner Scanner como atributo

    /**
     * Constructor de la clase Executable para inicializar el lector de entrada y el
     * controlador.
     *
     * @pre No se requieren precondiciones específicas.
     * @post Se crea una instancia de Executable y se inicializan el lector de
     *       entrada y el controlador.
     */
    public Executable() {
        //reader = new Scanner(System.in);
        cont = new Controller();
        escaner = new Scanner(System.in); // Inicializar Scanner
    }

    /**
     * Ejecuta el programa principal de gestión de colegios.
     *
     * @pre El método debe ser llamado dentro de un contexto válido.
     * @post El programa se ejecuta y permite al usuario interactuar con las
     *       opciones disponibles.
     * @return void Este método no retorna ningún valor.
     */

    public void run() {



        System.out.println("Inserte el número de filas de la matriz : ");
        int nFilas = escaner.nextInt();
        escaner.nextLine();

        System.out.println("Inserte el número de columnas de la matriz : ");
        int nColumnas = escaner.nextInt();
        escaner.nextLine();

        cont.inicializarMatrices(nColumnas, nFilas);

    
        System.out.println("Inserte los valores de la matriz #1 : ");
        for(int i = 0; i < nFilas; i++) {
            for(int j = 0; j < nColumnas; j++) {
                System.out.println("Insertar dato en fila " + i + " y columna " + j + " : ");
                int valor = escaner.nextInt();
                escaner.nextLine();
                cont.getMatriz1().insertarValor(i, j, valor);
            }
        }

        System.out.println("Inserte los valores de la matriz #2 : ");
        for(int i = 0; i < nFilas; i++) {
            for(int j = 0; j < nColumnas; j++) {
                System.out.println("Insertar dato en fila " + i + " y columna " + j + " : ");
                int valor = escaner.nextInt();
                escaner.nextLine();
                cont.getMatriz2().insertarValor(i, j, valor);
            }
        }
    
        System.out.println("Matriz 1: ");
        for (int i = 0; i < nFilas; i++){
            for (int j = 0; j < nColumnas; j++){
                System.out.print(cont.getMatriz1().getMatriz()[i][j] + " ");
            }
            System.out.println();

        }
        
        System.out.println("Matriz 2: ");
        for (int i = 0; i < nFilas; i++){
            for (int j = 0; j < nColumnas; j++){
                System.out.print(cont.getMatriz2().getMatriz()[i][j] + " ");
            }
            System.out.println();

        }

        MatrizNumerica matrizSuma = cont.suma();
        System.out.println("Resultado :");
        for (int i = 0; i < nFilas; i++) {
            for (int j = 0; j < nColumnas; j++) {
                System.out.print(matrizSuma.getMatriz()[i][j] + " ");
            }
            System.out.println();
        }



    }

    /**
     * Método principal (main) para iniciar la ejecución del programa.
     *
     * @pre No se requieren precondiciones específicas.
     * @post Se crea una instancia de Executable y se ejecuta el programa principal.
     * @param args Los argumentos de la línea de comandos (no se utilizan en este
     *             caso).
     */
    public static void main(String[] args) {

        Executable mainApp = new Executable();
        mainApp.run();

    }

}