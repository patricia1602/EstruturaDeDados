public class Vetores {

    public static void main(String[] args) {

        String nome = "Joao";
        double nota = 7.5;
        int ano = 2022;

        double nota1 = 6.3;
        double nota2 = 5.7;
        // ...
        double nota30 = 8.0;
        
        //indice sempre começa do vetor 0
        double[] notas = { 6.3, 5.7, 8.0 };

        //System.out.println(nota1);
        System.out.println(notas[0]);

        //visualiza valor anterior e o atualizado
        nota1 = 7.0;
        notas[0] = 7.0;
        System.out.println(notas[0]);

        double n;
        n = 7.8;

        double[] notasTurma1 = new double[30];
        notasTurma1[0] = 6.3;
        notasTurma1[10] = 3.8;

        //usando o for
       // for(int i=0; i<3; i++) {
       //   System.out.println(notas[i]);
       // }

       //lenght acessa o tamanho do vetor
       for(int i=0; i<notas.length; i++) {
           System.out.println(notas[i]);
       }


    }
}
