public class OperadoresRelacionaisDois {
    public static void main(String[] args) {
        String nomeUm = "Davi";
        String nomeDois = new String ("Davi");

        System.out.println(nomeUm.equals(nomeDois));

        
        int a = 1;
        int b = 2;

        boolean SimNao = a == b;

        if(a < b){
            System.out.println("Nossa condição é verdadeira");
        }

        System.out.println("O primeiro n° é igual ao segundo? " + SimNao);

        SimNao = a != b;

        System.out.println("O primeiro n° é diferente ao segundo? " + SimNao);

        SimNao = a > b; 

        System.out.println("O primeiro n° é maior que o segundo? " + SimNao);
    }
}
