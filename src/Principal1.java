/**
 * 
 * @author Thiago Sinatora
 * 
 * https://www.devmedia.com.br/entendendo-anotacoes-em-java/26772
 * 
 * 
 * Hierarquia de pastas feita errada com ponto, deve-se ter um aninhamento delas, os pontos são colocados
 * após o package no código fonte e não no nome da pasta.
 * 
 * Exemplo correto de packge, br\com\thiago\pacote\src\main
 * 
 */

public class Principal1 {
    public static void main(String []frodo){
        Funcionario funci = new Funcionario();
        System.out.println(funci.hashCode());
        System.out.println(funci.toString());        
        System.out.println(funci.getSalarioTotal(599));
    }
}
