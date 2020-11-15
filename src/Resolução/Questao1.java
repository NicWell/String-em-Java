package Resolução;
public class Questao1 {
    public static void main (String[] args){
        String sc = new String("CHAMADA");
        String sc2 = new String("chamada");  
        System.out.printf("A String Possui %s Caracteres %n", sc.length());
        
        System.out.println("A String possui os caracteres \n");
        //Estrutura de Repetição para facilitar a exibição
        for(int cont = 0; cont < sc.length(); cont ++){
            System.out.println(sc.charAt(cont)+ ";"+ "\n");
        }
        
        System.out.println("Todos os caracteres em maiúsculo: "+ sc+"\n");
        System.out.println("Todos os caracteres em Minúsculo:" + sc.toLowerCase()+"\n");
        //Levando em consideração se é maiúsculo ou não
        System.out.println("sc é igual a sc2:"+ sc.equals(sc2));
        //sem levar em consideração se é maiúsculo ou não
        System.out.println("sc é igual a sc2:" + sc.equalsIgnoreCase(sc2)+"\n");
        //Exiba os 3 primeiros caracteres da string1 e os 3 últimos caracteres. 
        System.out.println("Os três primeiros caracteres são:\n");
        for(int x = 0; x< 3; x++){
            System.out.println(sc.charAt(x));
        }
        System.out.println("\n");
        System.out.println("Os três últimos caracteres são:\n");
         int u = sc.length();
         int u2= sc.length() -3;
        for(int x2 = u2; x2 < u; x2++){
            System.out.println(sc.charAt(x2));
        }    
        
    }
}
