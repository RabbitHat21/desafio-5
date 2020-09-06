package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Consumidor consumidor = new Consumidor("Fellipe");

        consumidor.setTelefone(123456789);

        System.out.println("O telefone do comumidor é: " + consumidor.getTelefone());
    }
}
