
import java.util.Scanner;

public class Loja {
    public static void main(String[] args) {
        boolean cont=true;
        Scanner tecladoScanner = new Scanner(System.in);

        while(cont){
            System.out.println("\n1-Cadastro\n2-Busca\n3-Imprimir\n0-Sair");
            int key = tecladoScanner.nextInt();
            switch (key) {
                case 1:
                    Funcionarios funcionarios = new Funcionarios();
                    Scanner cadastroScanner = new Scanner(System.in);
                    System.out.println("Digite o nome:");
                    funcionarios.setNome(cadastroScanner.nextLine());
                    DataBase.adicionar(funcionarios);
                    break;
                case 2:
                    System.out.println("Buscar por:");
                    Scanner buscaScanner = new Scanner(System.in);
                    DataBase.buscar(buscaScanner.nextLine());
                    break;
                case 3:    
                    DataBase.imprimir();
                    break;
                case 0:
                    tecladoScanner.close();
                    cont=false;
                    break;
                default:
                    System.out.println("Inválido!\n");
                    break;
            }
        }
    }
}
