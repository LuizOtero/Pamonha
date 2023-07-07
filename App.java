// print no console 
public class App {
	public static void main(String[] args) {
               System.out.println("Joao não faz nada");
         }
        }
// variaveis 
int idade = 25;
double altura = 1.75;
char genero = 'M';
boolean estudante = true;
String nome = "Ana";


// arrays em tipos diferentes 
public class App {

    public static void main(String[] args) { 
        int[] numeros = {1, 2, 3, 4, 5};

        String[] nomes = {"Ana", "Maria", "Pedro", "Carlos"};
         
        boolean[] falseTrue = {true, false, true, true};

        char[] letras = {'L', 'G', 'B', 'A'};

        double[] virgulas = {2.5, 3.7, 1.9, 4.2};


    }
}
// estruturas de repetição 'para'
for (int i = 0; i < 5; i++) {
    System.out.println(i);
}
// estrutura de repetição 'enquanto'
int i = 0;
while (i < 5) {
    System.out.println(i);
    i++;
}
// estrutura condicional "if"
public class App {
    public static void main(String[] args) {
        int idade = 17;

        if (idade >= 18) {
            System.out.println("Você é maior de idade.");
        } else {
            System.out.println("Você é menor de idade.");
        }
    }
}
// retornar variavel int
public class App {

    public static void main(String[] args) {
        int idade = 25;
        int idade2 = 24;

        int resultado = somar(idade, idade2);
        System.out.println("O resultado da soma é: " + resultado);
    }

    public static int somar(int idade, int idade2) {
        int soma = idade + idade2;
        return soma;
    }
}
// retornar variavel String 
public class App {
    public static void main(String[] args) {
        String mensagem = Msg();
        System.out.println(mensagem);
    }

    public static String Msg() {
        String mensagem = "Pamonha";
        return mensagem;
    }
}
// variavel Char
public class App {
    public static void main(String[] args) {
        char resultado = obterCaractere();
        System.out.println("O caractere retornado é: " + resultado);
    }

    public static char obterCaractere() {
        char caractere = 'A';
        return caractere;
    }
}
// variavel em boolean 
public class App {
    public static void main(String[] args) {
        boolean resultado = verificarCondicao();
        System.out.println("O resultado da verificação é: " + resultado);
    }

    public static boolean verificarCondicao() {
        boolean condicao = true;
        return condicao;
    }
}
// variavel double 
public class App {
    public static void main(String[] args) {
        double resultado = obterValor();
        System.out.println("O valor retornado é: " + resultado);
    }

    public static double obterValor() {
        double valor = 3.14;
        return valor;
    }
}
//Uma classe em java e instânciar um objeto dessa classe (Grande parte desse texto foi pesquisado, entendi a logica de como fazer, só que não consegui executar)
public class App {

    private String nome;
    private int idade;
    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
}
public class App {
    public static void main(String[] args) {
         Pessoa pessoa1 = new Pessoa("João", 25);
         System.out.println("Nome: " + pessoa1.getNome());
        System.out.println("Idade: " + pessoa1.getIdade());
    }
}
