package projetoXadrez;

import java.util.Scanner;

public class Xadrez {

	public static void main(String[] args) {
		 Scanner op = new Scanner(System.in);
	        String letra;
	        String num;
	        //Primeiro eu criei uma matriz, como se fosse o tabuleiro e a posição inicial do cavalo (X)
	        char[][] mesa_xadrez = {
	            { '0', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', '0' },
	            { '8', '0', '0', '0', '0', '0', '0', '0', '0', '8' },
	            { '7', '0', '0', '0', '0', '0', '0', '0', '0', '7' },
	            { '6', '0', '0', '0', '0', '0', '0', '0', '0', '6' },
	            { '5', '0', '0', 'X', '0', '0', '0', '0', '0', '5'},
	            { '4', '0', '0', '0', '0', '0', '0', '0', '0', '4' },
	            { '3', '0', '0', '0', '0', '0', '0', '0', '0', '3' },
	            { '2', '0', '0', '0', '0', '0', '0', '0', '0', '2' },
	            { '1', '0', '0', '0', '0', '0', '0', '0', '0', '1' },
	            { '0', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', '0' }
	        };
	        
	        mostrarMatriz(mesa_xadrez);
	        mostrarCavalo(mesa_xadrez);
	        //Essa parte serve para a pessoa que está executando o algoritmo escolha a próxima posição do cavalo
	        //A pessoa vai ter que escolher a letra (de forma maiúscula) para qual coluna quer que o cavalo vá
	        //Após essa etapa a pessoa vai ter que escolher um número, para decidir em qual linha é para o cavalo ir
	        System.out.println("Mudando cavalo(X) de lugar,");
	        System.out.println("Posições disponíveis: A4, A6, B3, B7, D3, D7, E4, E6");
	        System.out.print("Insira a letra (maiúscula): ");
	        letra = op.next();
	        while (!(letra).equals("A") && !(letra).equals("B") && !(letra).equals("D") && !(letra).equals("E")){
	            System.out.print("Insira a letra: ");
	            letra = op.next();
	        }
	        
	        if(letra.equals("A") || letra.equals("E")){
	            System.out.print("Insira o número(apenas 4 ou 6): ");
	            num = op.next();
	            while (!(num).equals("4") && !(num).equals("6")){
	                System.out.print("Insira o número(apenas 4 ou 6): ");
	                num = op.next();
	            }
	            mudarCavalo(mesa_xadrez, letra, num);
	        }
	        
	        if(letra.equals("B") || letra.equals("D")){
	            System.out.print("Insira o número(apenas 3 ou 7): ");
	            num = op.next();
	            while (!(num).equals("3") && !(num).equals("7")){
	                System.out.print("Insira o número(apenas 3 ou 7): ");
	                num = op.next();
	            }
	            mudarCavalo(mesa_xadrez, letra, num);
	        }
	        
	        System.out.println("O cavalo(X) mudou de lugar");
	        
	        mostrarMatriz(mesa_xadrez);
	        mostrarCavalo(mesa_xadrez);
	        
	    }
	    //Agora o algoritmo vai mostrar o cavalo na posição escolhida
	    public static void mostrarMatriz(char[][] _matriz){
	        for (int l = 0; l < _matriz.length; l++)  {  
	            for (int c = 0; c < _matriz[0].length; c++)     { 
	                System.out.print(_matriz[l][c] + " ");
	            }  
	            System.out.println(" ");
	        }
	    }
	    
	    public static void mostrarCavalo(char[][] _matriz){
	        for (int l = 0; l < _matriz.length; l++)  {  
	            for (int c = 0; c < _matriz[0].length; c++)     { 
	                if(_matriz[l][c] == 'X'){
	                    System.out.println("O cavalo(X) está na posição: "+_matriz[0][c]+ _matriz[l][0]);
	                }
	            }
	        }
	    }
	    
	    public static void mudarCavalo(char[][] _matriz, String _letra, String _num){
	        char []letra = _letra.toCharArray();
	        char []num = _num.toCharArray();
	        
	        for (int l = 0; l < _matriz.length; l++)  {  
	            for (int c = 0; c < _matriz[0].length; c++)     { 
	                if(_matriz[l][c] == 'X'){
	                    _matriz[l][c] = '0';
	                }
	            }
	        }
	        for (int l = 0; l < _matriz.length; l++)  {  
	            for (int c = 0; c < _matriz[0].length; c++) {
	                if(_matriz[0][c] == letra[0] && _matriz[l][0] == num[0] ){
	                    _matriz[l][c] = 'X';
	                }
	            }
	        }

	}

}