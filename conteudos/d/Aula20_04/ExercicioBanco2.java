
package d.Aula20_04;

import java.util.Scanner;

public class ExercicioBanco2 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
         while(true){
            System.out.println("Qual o valor deseja sacar :  ");
            int numero = entrada.nextInt();
            if(numero == 0 || numero == 3 || numero == 1) {
                System.out.println("O menor valor possivel para saque é R$2 mas R$3 você não pode sacar, pois não temos moedas, então você pode sacar R$4 ou acime de R$4, muito obrigado!!");
            }
            else{
                if(numero % 5 == 0){
                    int nota1 = numero / 100; 
                    int nota2 = (numero % 100) / 50;
                    int nota3 = (numero % 100 % 50) / 20;
                    int nota4 = (numero % 100 % 50 % 20) / 10; 
                    int nota5 = (numero % 100 % 50 % 20 % 10) / 5;
                    System.out.println(nota1 + " " + "nota de R$ 100");
                    System.out.println(nota2 + " " + "nota de R$ 50");
                    System.out.println(nota3 + " " + "nota de R$ 20");
                    System.out.println(nota4 + " " + "nota de R$ 10");
                    System.out.println(nota5 + " " + "nota de R$ 5");
                }
                else{
                    if((numero % 100 % 50 % 20 % 10 % 5) % 2 == 0){
                        int nota1 = numero / 100; 
                        int nota2 = (numero % 100) / 50;
                        int nota3 = (numero % 100 % 50) / 20;
                        int nota4 = (numero % 100 % 50 % 20) / 10; 
                        int nota5 = (numero % 100 % 50 % 20 % 10) / 5;
                        int nota6 = (numero % 100 % 50 % 20 % 10 % 5) / 2;
                        System.out.println(nota1 + " " + "nota de R$ 100");
                        System.out.println(nota2 + " " + "nota de R$ 50");
                        System.out.println(nota3 + " " + "nota de R$ 20");
                        System.out.println(nota4 + " " + "nota de R$ 10");
                        System.out.println(nota5 + " " + "nota de R$ 5");
                        System.out.println(nota6 + " " + "nota de R$ 2");
                    }
                    else{
                        if((numero % 100 % 50 % 20 % 10) % 5 == 1 ){
                            int arredondamento = numero - 6;   
                            int nota1 = arredondamento / 100;
                            int nota2 = (arredondamento % 100) / 50;
                            int nota3 = (arredondamento % 100 % 50) / 20;
                            int nota4 = (arredondamento % 100 % 50 % 20) / 10; 
                            int nota5 = (arredondamento % 100 % 50 % 20 % 10) / 5;
                            int nota6 = 6 / 2;
                            System.out.println(nota1 + " " + "nota de R$ 100");
                            System.out.println(nota2 + " " + "nota de R$ 50");
                            System.out.println(nota3 + " " + "nota de R$ 20");
                            System.out.println(nota4 + " " + "nota de R$ 10");
                            System.out.println(nota5 + " " + "nota de R$ 5");
                            System.out.println(nota6 + " " + "nota de R$ 2"); 
                        }
                        else{
                            if((numero % 100 % 50 % 20 % 10) % 5 == 2 ){
                                int arredondamento = numero - 2;   
                                int nota1 = arredondamento / 100;
                                int nota2 = (arredondamento % 100) / 50;
                                int nota3 = (arredondamento % 100 % 50) / 20;
                                int nota4 = (arredondamento % 100 % 50 % 20) / 10; 
                                int nota5 = (arredondamento % 100 % 50 % 20 % 10) / 5;
                                int nota6 = 2 / 2;
                                System.out.println(nota1 + " " + "nota de R$ 100");
                                System.out.println(nota2 + " " + "nota de R$ 50");
                                System.out.println(nota3 + " " + "nota de R$ 20");
                                System.out.println(nota4 + " " + "nota de R$ 10");
                                System.out.println(nota5 + " " + "nota de R$ 5");
                                System.out.println(nota6 + " " + "nota de R$ 2"); 
                            }
                            else{
                                if((numero % 100 % 50 % 20 % 10) % 5 == 3 ){
                                    int arredondamento = numero - 8;   
                                    int nota1 = arredondamento / 100;
                                    int nota2 = (arredondamento % 100) / 50;
                                    int nota3 = (arredondamento % 100 % 50) / 20;
                                    int nota4 = (arredondamento % 100 % 50 % 20) / 10; 
                                    int nota5 = (arredondamento % 100 % 50 % 20 % 10) / 5;
                                    int nota6 = 8 / 2;
                                    System.out.println(nota1 + " " + "nota de R$ 100");
                                    System.out.println(nota2 + " " + "nota de R$ 50");
                                    System.out.println(nota3 + " " + "nota de R$ 20");
                                    System.out.println(nota4 + " " + "nota de R$ 10");
                                    System.out.println(nota5 + " " + "nota de R$ 5");
                                    System.out.println(nota6 + " " + "nota de R$ 2"); 
                                }
                                else{    
                                    if((numero % 100 % 50 % 20 % 10) % 5 == 4){  
                                        int arredondamento = numero - 4;   
                                        int nota1 = arredondamento / 100;
                                        int nota2 = (arredondamento % 100) / 50;
                                        int nota3 = (arredondamento % 100 % 50) / 20;
                                        int nota4 = (arredondamento % 100 % 50 % 20) / 10; 
                                        int nota5 = (arredondamento % 100 % 50 % 20 % 10) / 5;
                                        int nota6 = 4 / 2;
                                        System.out.println(nota1 + " " + "nota de R$ 100");
                                        System.out.println(nota2 + " " + "nota de R$ 50");
                                        System.out.println(nota3 + " " + "nota de R$ 20");
                                        System.out.println(nota4 + " " + "nota de R$ 10");
                                        System.out.println(nota5 + " " + "nota de R$ 5");
                                        System.out.println(nota6 + " " + "nota de R$ 2");
                                    }
                                    else {
                                         System.out.println("O menor valor possivel para saque é R$2 mas R$3 você não pode sacar, pois não temos moedas, então você pode sacar R$4 ou acime de R$4, muito obrigado!!");      
                                    }    
                                }
                            } 
                        }
                    }
                }
            } 
            System.out.print("\n");
        }    
    }
}    

