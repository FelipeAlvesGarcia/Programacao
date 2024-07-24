package BatalhaNaval;

import java.util.Scanner;
import java.util.Random;

public class Jogo {    
    public static void main(String[] args) throws InterruptedException{
        Scanner ler = new Scanner(System.in);
        char[][] mar1 = new char[10][10];
        char[][] mar2 = new char[10][10];
        carregarMar(mar1, mar2);
        int opcao;
        System.out.println("\t --- Bem-Vindo ao Batalha Naval! ---");
        System.out.println("\n(1)-> Player x Player");
        System.out.println("(2)-> Player x Máquina\n");
        for(opcao=0; opcao!=1 && opcao!=2;){
            System.out.print("Opcao: ");
            opcao = ler.nextInt();
        }
        int player=1;
        boolean bot = false, denovo;
        char automatico;
        switch(opcao){
            case 1->{
                System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n----------------- PLAYER 1 -----------------");
                for(automatico='f'; automatico != 's' && automatico != 'n';){
                    System.out.print("Alocar barcos automaticamente?\n(s - sim | n - não) --> ");  
                    automatico = ler.next().toLowerCase().charAt(0);
                }
                if(automatico=='s')
                    bot=true;
                alocarBarcos(mar1, bot);
                bot=false;
                System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n----------------- PLAYER 2 -----------------");
                for(automatico='f'; automatico != 's' && automatico != 'n';){
                    System.out.print("Alocar barcos automaticamente?\n(s - sim | n - não) --> ");  
                    automatico = ler.next().toLowerCase().charAt(0);
                }
                if(automatico=='s')
                    bot=true;
                alocarBarcos(mar2, bot);
                bot=false;             
                System.out.print("\n\n\n\n\n\n\n\n\n\n\n\n");
                boolean win = false;
                int f=0;
                for(;win!=true;){
                    denovo=true;
                    for(;denovo==true && win==false;){
                        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n---> JOGADOR 1 - Atacando:\t\t\t\t\t-->Seu Mapa:");
                        player = 1;
                        carregarMapas(mar1, mar2, player, bot);
                        denovo = ataque(mar2, bot);     
                        win = testeWin(mar2);
                    }
                    f++;
                    if(f==1)
                        ler.nextLine();
                    if(win!=true){
                        System.out.print("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\nPlayer 2, clique ENTER para continuar");
                        ler.nextLine();
                    }
                    if(win!=true){
                        denovo=true;
                        for(;denovo==true && win==false;){
                            System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n---> JOGADOR 2 - Atacando:\t\t\t\t\t-->Seu Mapa:");
                            player = 2;
                            carregarMapas(mar1, mar2, player, bot);
                            denovo = ataque(mar1, bot);     
                            win = testeWin(mar1);
                        }  
                        if(win!=true){
                            System.out.print("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\nPlayer 1, clique ENTER para continuar");
                            ler.nextLine();
                        }
                    }
                }
                win(player, bot);
            }
            case 2->{
                System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n----------------- PLAYER 1 -----------------");
                for(automatico='f'; automatico != 's' && automatico != 'n';){
                    System.out.print("Alocar barcos automaticamente?\n(s - sim | n - não) --> ");  
                    automatico = ler.next().toLowerCase().charAt(0);
                }
                if(automatico=='s')
                    bot=true;
                alocarBarcos(mar1, bot); 
                System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n-------------------- BOT -------------------");
                bot = true;
                carregarMapaAmigo(mar2);
                alocarBarcos(mar2, bot);
                System.out.println("\n\t - BOT alocando os barcos...");
                Thread.sleep(5000);
                
                System.out.print("\n\n\n\n\n\n\n\n\n\n\n\n");
                boolean win = false;
                for(;win!=true;){
                    bot = false;
                    denovo = true;
                    for(;denovo==true && win == false;){
                        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n---> JOGADOR 1 - Atacando:\t\t\t\t\t-->Seu Mapa:");
                        player = 1;
                        carregarMapas(mar1, mar2, player, bot);
                        denovo = ataque(mar2, bot); 
                        win = testeWin(mar2);
                    }
                    
                    if(win!=true){
                        denovo = true;
                        bot = true;
                        for(;denovo==true && win==false;){
                            System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n---> BOT - Atacando:");
                            player = 2;
                            carregarMapas(mar1, mar2, player, bot);
                            System.out.println("O BOT está jogando...");
                            denovo = ataque(mar1, bot); 
                            win = testeWin(mar1);
                        }    
                    }
                }
                win(player, bot);
            }
        }
    }
    
    public static void carregarMar(char[][] mar1, char[][] mar2){
        for(int l=0; l<mar1.length; l++){
            for(int c=0; c<mar1[l].length; c++){
                mar1[l][c] = 'A';
            }
        }
        for(int l=0; l<mar2.length; l++){
            for(int c=0; c<mar2[l].length; c++){
                mar2[l][c] = 'A';
            }
        }
    }
    
    public static void carregarMapaAmigo(char[][] mar){
       System.out.println("\n   | 0 | 1 | 2 | 3 | 4 | 5 | 6 | 7 | 8 | 9 |");
       System.out.println("--------------------------------------------");
       String linha;
       for(int l=0; l<mar.length; l++){
           linha = "";
           linha += String.format(" %d | ", l);
           for(int c=0; c<mar[l].length; c++){
               if(mar[l][c] == 'A')
                   linha += String.format("  | ");
               else if(mar[l][c]=='B')
                   linha += String.format("B | ");
               else if(mar[l][c]=='a'){
                   linha += String.format("º | ");
               }
               else
                   linha += String.format("X | ");
           }
           System.out.println(linha);
           System.out.println("--------------------------------------------");
       }
    }
    
    public static void alocarBarcos(char[][] mar, boolean bot){
        Scanner ler = new Scanner(System.in);
        Random ale = new Random();
        boolean hitbox;
        boolean denovo;
        int[] propriedadesBarcos = {4, 3, 2, 1};
        int x, y;
        char direcao;
        for(int i=propriedadesBarcos.length-1; i>=0; i--){
            for(int j=1; j<=propriedadesBarcos[i]; j++){
                denovo = false;
                hitbox = false;
                for(;hitbox==false;){
                    if(bot==false)
                        carregarMapaAmigo(mar);
                    x=-1;
                    y=-1;
                    direcao = 'e';
                    if(denovo==true && bot==false)
                        System.out.println("\nNão foi possível alocar o barco\n");
                    for(;direcao != 'v' && direcao != 'h' && bot==false && i>0;){
                        System.out.print("Digite a direção (h - horizontal; v - vertical) do "+j+"º barco de "+(i+1)+" espaços: ");
                        direcao = ler.next().toLowerCase().charAt(0);
                    }
                    if(i==0)
                        direcao = 'v';
                    if(bot==false)
                        System.out.println(" - Escolha um lugar para alocar o "+j+"º barco de "+(i+1)+" espaços: ");
                    if(bot==false){
                        for(;x<0 || x>9;){
                            System.out.print("   - x: ");
                            x = ler.nextInt();   
                        }
                        for(;y<0 || y>9;){
                            System.out.print("   - y: ");
                            y = ler.nextInt();     
                        }    
                    }
                    if(bot==true){
                        x = ale.nextInt(0, 10);
                        y = ale.nextInt(0, 10);
                        int d = ale.nextInt(0, 2);
                        if(d==0)
                            direcao = 'v';
                        else
                            direcao = 'h';
                    }
                    switch(direcao){
                        case 'v' ->{
                            if(y+i <= 9){
                                hitbox = true;
                                for(int t=y; t<=(y+i); t++){
                                    if(mar[t][x]!='A' && mar[t][x] != 'a'){
                                        hitbox = false;
                                        denovo = true;
                                    }
                                }
                                if(hitbox==true){
                                    for(int l=y; l<=(y+i); l++)
                                        mar[l][x] = 'B';
                                }
                            }
                            else{
                                denovo = true;
                            }
                        }
                        case 'h' ->{
                            if(x+i <= 9){
                                hitbox = true;
                                for(int t=x; t<=(x+i); t++){
                                    if(mar[y][t]!='A' && mar[y][t] != 'a'){
                                        hitbox = false;
                                        denovo = true;
                                    }
                                }
                                if(hitbox==true){
                                    for(int c=x; c<=(x+i); c++)
                                        mar[y][c] = 'B';
                                }
                            }
                            else{
                                denovo = true;
                            }
                        }
                    }
                }
            }
        }
    }
    
    public static void carregarMapas(char[][] mar1, char[][] mar2, int player, boolean bot){
        if(bot==false || player==1){
            System.out.println("\n   | 0 | 1 | 2 | 3 | 4 | 5 | 6 | 7 | 8 | 9 |\t\t\t   | 0 | 1 | 2 | 3 | 4 | 5 | 6 | 7 | 8 | 9 |");
            System.out.println("--------------------------------------------\t\t\t--------------------------------------------");    
        }
        String linha;
        if(player==1){
            for(int l=0; l<mar1.length; l++){
                linha = "";
                linha += String.format(" %d | ", l);
                for(int c=0; c<mar2[l].length; c++){
                    if(mar2[l][c] == 'A' || mar2[l][c]=='B')
                        linha += String.format("  | ");
                    else if(mar2[l][c]=='a'){
                        linha += String.format("º | ");
                    }
                    else
                        linha += String.format("X | ");
                }   
                linha += String.format("\t\t\t");
                linha += String.format(" %d | ", l);
                for(int c=0; c<mar1[l].length; c++){
                    if(mar1[l][c] == 'A')
                        linha += String.format("  | ");
                    else if(mar1[l][c]=='B')
                        linha += String.format("B | ");
                    else if(mar1[l][c]=='a'){
                        linha += String.format("º | ");
                    }
                    else
                        linha += String.format("X | ");
                }  
                System.out.println(linha);
                System.out.println("--------------------------------------------\t\t\t--------------------------------------------");
            }
        }
        else if(player==2 && bot!=true){
            for(int l=0; l<mar1.length; l++){
                linha = "";
                linha += String.format(" %d | ", l);
                for(int c=0; c<mar1[l].length; c++){
                    if(mar1[l][c] == 'A' || mar1[l][c]=='B')
                        linha += String.format("  | ");
                    else if(mar1[l][c]=='a'){
                        linha += String.format("º | ");
                    }
                    else
                        linha += String.format("X | ");
                }   
                linha += String.format("\t\t\t");
                linha += String.format(" %d | ", l);
                for(int c=0; c<mar2[l].length; c++){
                    if(mar2[l][c] == 'A')
                        linha += String.format("  | ");
                    else if(mar2[l][c]=='B')
                        linha += String.format("B | ");
                    else if(mar2[l][c]=='a'){
                        linha += String.format("º | ");
                    }
                    else
                        linha += String.format("X | ");
                }  
                System.out.println(linha);
                System.out.println("--------------------------------------------\t\t\t--------------------------------------------");
            }
        }
        else{
            System.out.println("\n   | 0 | 1 | 2 | 3 | 4 | 5 | 6 | 7 | 8 | 9 |");
            System.out.println("--------------------------------------------");    
            for(int l=0; l<mar1.length; l++){
                linha = "";
                linha += String.format(" %d | ", l);
                for(int c=0; c<mar1[l].length; c++){
                    if(mar1[l][c] == 'A' || mar1[l][c]=='B')
                        linha += String.format("  | ");
                    else if(mar1[l][c]=='a'){
                        linha += String.format("º | ");
                    }
                    else
                        linha += String.format("X | ");
                }   
                System.out.println(linha);
                System.out.println("--------------------------------------------");
            }
        }
    }
    
    public static boolean ataque(char[][] mar, boolean bot) throws InterruptedException{
        Random ale = new Random();
        Scanner ler = new Scanner(System.in);
        int x, y;
        boolean denovo = false;
        x=-1;
        y=-1;
        if(bot==false){
            for(;x<0 || x>9;){
                System.out.print(" - x: ");
                x = ler.nextInt();   
            }
            for(;y<0 || y>9;){
                System.out.print(" - y: ");
                y = ler.nextInt();     
            }
            if(mar[y][x] == 'B'){
                mar[y][x] = 'b'; 
                denovo = true;
                System.out.println("\nVocê ACERTOU! Jogue novamente!\n");
            }
            else if(mar[y][x] == 'A'){
                mar[y][x] = 'a';
                System.out.println("\nVocê ERROU! Será a vez do outro jogador!");
            }
            else{
                System.out.println("\nEste lugar já foi atacado! Jogue novamente!\n");
                denovo = true;
            }
            Thread.sleep(3000);
        }
        else{
            x = ale.nextInt(0, 10);
            y = ale.nextInt(0, 10);
            if(mar[y][x] == 'B'){
                mar[y][x] = 'b'; 
                denovo = true;
                Thread.sleep(1500);
                System.out.println("\nO bot ACERTOU! O bot vai jogar novamente!\n");
                Thread.sleep(2500);
            }
            else if(mar[y][x] == 'A'){
                mar[y][x] = 'a'; 
                Thread.sleep(1500);
                System.out.println("\nO bot ERROU! Será a vez Player 1!");
                Thread.sleep(2500);
            }  
            else{
                denovo = true;
            }
        }
        return denovo;
    }
    
    public static boolean testeWin(char[][] mar){
        int cont=0;
        for(int l=0; l<mar.length; l++){
            for(int c=0; c<mar[l].length; c++){
                if(mar[l][c] == 'B')
                    cont++;
            }
        }
        if(cont>0)
            return false;
        else
            return true;
    }
    
    public static void win(int player, boolean bot){
         System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
         if(bot == false)
             System.out.println("-------PLAYER "+player+" ganhou!-------\n");
         else
             System.out.println("---------BOT ganhou! ---------\n");
     }
}