import java.lang.reflect.Field;

public class TesteAnotacao {
    
    @Deprecated
    public static int valor = 1;

    public static void main(String [] frodo) throws Exception{

        Field field = TesteAnotacao.class.getField("valor");        
        if(field.isAnnotationPresent(Deprecated.class)){
            System.out.println("Anotação Deprecated presente");
        } else{
            System.out.println("Anotação Deprecated NÃO está presente");
        }
    }
}
