import java.util.*;

public class DataBase {
    private static ArrayList<Funcionarios> sistema = new ArrayList<>();

    public static ArrayList<Funcionarios> getSistema() {
        return sistema;
    }

    public static void adicionar(Funcionarios funcionario){
        sistema.add(funcionario);
    }

    public static void imprimir(){
        for(Funcionarios funcionario : sistema){
            System.out.println(funcionario.getNome());
        }
    }

    public static void buscar(String nome){
        for(Funcionarios F : sistema){
            if(F.getNome().equalsIgnoreCase(nome)){ 
                System.out.println("\nEncontrado: " + F.getNome());
                break;
            }
            else{
            }
        }
    }
}
