package academy.devdojo.aulas;

// Estruturas Condicionais  - Resolução do exercícios
//DESAFIO DE IMPOSTO.

public class Aula04 {
    public static void main(String[] args) {
        double salarioAnual = 45000;
        double primeiraFaixa = 9.70 / 100;
        double segundaFaixa = 37.35 / 100;
        double terceiraFaixa = 49.50 / 100;
        double valorImposto ;

        if( salarioAnual <= 34.712){
            salarioAnual = salarioAnual * primeiraFaixa;
        }else if (salarioAnual >=34713 && salarioAnual <=  68507){
            salarioAnual = salarioAnual * segundaFaixa;
        }else{
            salarioAnual = salarioAnual * terceiraFaixa;
        }
        System.out.println(salarioAnual);
    }
}
