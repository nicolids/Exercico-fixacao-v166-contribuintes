package Apllication;

import models.Contribuinte;
import models.ContribuintePf;
import models.ContribuintePj;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {
        Scanner src=new Scanner(System.in);
        List<Contribuinte> lista= new ArrayList<>();

        System.out.println("Digite o número de contribuintes:");
        int n= src.nextInt();
        
        for (int i=1;i<=n;i++){
            System.out.println("Contribuinte "+i+"#");
            System.out.println("Pessoa Física ou Jurídica (f/j)?");
            char tipo=src.next().charAt(0);
            System.out.println("Nome:");
            src.nextLine();
            String nome= src.nextLine();
            System.out.println("Qual o rendimento anual?");
            double rendimento=src.nextDouble();
            src.nextLine();

            if(tipo == 'f'){
                System.out.println("Valor dos gastos com saúde:");
                double gastosSaude;

                gastosSaude = src.nextDouble();
                lista.add(new ContribuintePf(nome,rendimento,gastosSaude));
            }
            else {
                System.out.println("Qual o número de empregados:");
                int num=src.nextInt();
                lista.add(new ContribuintePj(nome,rendimento,num));
            }

        }

        System.out.println();
        System.out.println("Taxas pagas:");
        for(Contribuinte cont : lista){
            System.out.println(cont.getNome()+":  $"+String.format("%.2f",cont.taxasApagar()));
        }



        System.out.println();
        double sum = 0;
        for (Contribuinte c :lista){
            sum += c.taxasApagar();
        }
        System.out.printf("Total de taxas pagas: $ %.2f",sum);
        
    }
}
