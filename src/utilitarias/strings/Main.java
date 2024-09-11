package utilitarias.strings;

import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) {

        //INSTANCIANDO STRINGS

        String vazia = new String();
        String java = new String("JAVA");

        char [] valores = {'J','A', 'V', 'A'};
        String java0 = new String(valores);

        //Usando mesmo endereco de memoria
        String java1 = "valor";
        String java2 = "valor";

        //Usando a tabela ascii para gerar o alfabeto
        for (int i = 65; i < 91; i++){
            byte [] valor = {(byte) i};
            String saida = new String(valor);
            System.out.print(saida + "-");
        }

        System.out.println();
        System.out.println("COMPARANDO STRINGS");
        //COMPARANDO STRINGS
        String ola = "olá";
        String ola2 = "OLÁ";
        String ola3 = "olá";

        //exatamente igual
        System.out.println(ola.equals(ola2));
        //mesmo caracteres
        System.out.println(ola.equalsIgnoreCase(ola2));

        //Compara endereco de memoria e não os valores
        System.out.println(ola == ola3);

        String banana = "banana";
        String ana = "ana";
        String ban = "ban";

        System.out.println(banana.regionMatches(1, ana, 0, 3));
        System.out.println(banana.endsWith(ana));
        System.out.println(banana.startsWith(ban));

        System.out.println();
        System.out.println("FAZENDO BUSCAS EM STRINGS");

        //retorna o indice do primeiro caracter encontrado, se retornar -1 não existe.
        System.out.println(banana.indexOf("x"));
        System.out.println(banana.indexOf(ana));
        System.out.println(banana.indexOf(ban));

        //retorna o indice do ultimo caracter encontrado
        System.out.println(banana.lastIndexOf("a"));

        //Contains
        System.out.println(banana.contains(ana));
        System.out.println(banana.contains("ceu"));

        System.out.println("MODIFICANDO STRINGS");

        String teste = "Isso é um teste.";
        System.out.println(teste.substring(10));
        System.out.println(teste.substring(10, 15));

        System.out.println(teste.concat("Teste."));
        System.out.println(teste.substring(0, 10).concat("TESTE!"));

        String espaco = "i s p a ç o";
        System.out.println(espaco.replace("i", "e"));
        System.out.println(espaco.replace("i", "e").replace(" ", ""));

        String valorX = " È sei lá ";
        System.out.println(valorX.trim());

        String valorY = "Oi Meu Nome è Hugo";
        System.out.println(valorY.toLowerCase());
        System.out.println(valorY.toUpperCase());

        System.out.println(String.join(",", "A", "B", "C", "D"));
        String alfabeto = String.join(",", "A", "B", "C", "D");

        String [] letras = alfabeto.split(",");
        for(String l:letras){
            System.out.println(l);
        }

        System.out.println("CONCATENANDO STRINGS");

        String [] alfabeto1 = {"A", "B", "C", "D"};

        StringBuffer sb = new StringBuffer();

        for(String a: alfabeto1){
            sb.append(a);
        }
        System.out.println(sb.toString());
        System.out.println(sb.reverse());

        StringBuilder sb_ = new StringBuilder();

        for(String a: alfabeto1){
            sb_.append(a);
        }
        System.out.println(sb_.toString());
        System.out.println(sb_.reverse());

        System.out.println("STRING TOKENIZER");

        String arquivo = "1;Hugo Silva;30;";
        StringTokenizer st = new StringTokenizer(arquivo, ";");

        while (st.hasMoreTokens()){
            System.out.println(st.nextToken());
        }





    }
}
