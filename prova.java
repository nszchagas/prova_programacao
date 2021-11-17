import java.util.*;
class Main {  
  public static void main(String args[]) { 
    Scanner scan = new Scanner(System.in);
    String entrada;
    ArrayList<Character> caracteresDiferentes = new ArrayList<Character>();
    entrada = scan.nextLine();
    Integer[] contagemCaracteres;
        
    for (int i=0; i < entrada.length(); i++){
      Character caractere = entrada.charAt(i);
      if (!caracteresDiferentes.contains(caractere) & !Character.isWhitespace(caractere)){
        caracteresDiferentes.add(caractere);
      }
    }
    contagemCaracteres = new Integer[caracteresDiferentes.size()];
    for (int i=0; i < caracteresDiferentes.size(); i++){
      contagemCaracteres[i] = contaCaractere(caracteresDiferentes.get(i), entrada);
    }
    Arrays.sort(contagemCaracteres, Collections.reverseOrder());
    System.out.print(Arrays.toString(contagemCaracteres));
    scan.close();
  } 

  static Integer contaCaractere(Character caractere, String texto) {
    Integer contagem = 0;
    for (int i=0; i < texto.length(); i++){
      if(texto.toLowerCase().charAt(i) == Character.toLowerCase(caractere)){
        contagem += 1;
      }
    } 
    return contagem;
  }
}


