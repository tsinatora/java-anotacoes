/**
* Um TODO voltado para grupos
* de desenvolvedores, onde pode-se
* especificar a pessoa a quem se destina o item
*/

public @interface groupTODO {
	public enum Severity
 { CRITICAL, IMPORTANT, TRIVIAL, DOCUMENTATION };
	Severity severity( ) default Severity.IMPORTANT;
	String item( );
	String assignedTo( );
}