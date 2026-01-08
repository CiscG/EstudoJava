//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        String nome = "Rogério Skylab: ";
        int valor = 10;
        int valor2 = 34;

        System.out.println(nome + (valor + valor2));
        System.out.println(valor + valor2);
        valor *= valor2;
        System.out.println(valor);

        int idade = 21;
        //boolean resultado;
        //resultado = idade >= 18;

        if(idade >= 18){
            System.out.println("Acesso permitido");
        }else{
            System.out.println("Acesso negado");
        }

    }
}