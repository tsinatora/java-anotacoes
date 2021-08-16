/**
 * 
 * @author Thiago Sinatora
 * 
 * https://www.devmedia.com.br/entendendo-anotacoes-em-java/26772
 * 
 * 
 */

public class Funcionario {    
	protected double salario;

	//@InProgress  // cria uma anotação que marca algo ainda em construção
	//@Todo(value="O salário total do funcionário =	salário + bonus")
	@groupTODO
	(severity=groupTODO.Severity.TRIVIAL,
	 item="O salário total do funcionário = salário + bonus",
	 assignedTo="Thiago Sinatora"
	)
	@Deprecated double getSalarioTotal(double bonus) {
		return this.salario + bonus;
	}
    
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Funcionario [salario=");
		builder.append(salario);
		builder.append("]");
		return builder.toString();
	}
        
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(salario);
		result = prime * result + (int)
  (temp ^ (temp >>> 32));
		return result;
	}       
}

class Auxiliar extends Funcionario {
	protected double extra;

    @Override
    //public double getSalarioTotal(float bonus) { tipo parm errado para herança
	public double getSalarioTotal(double bonus) {
		return this.salario + this.extra + bonus;
	}
}