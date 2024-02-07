package model.appuntamento;
import java.time.LocalDate;
import model.cliente.Cliente;
import java.time.LocalTime;
import model.dipendente.*;
import model.servizio.Servizio;
import model.titolare.Titolare;
import net.sf.jsqlparser.expression.DateTimeLiteralExpression.DateTime;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "Appuntamenti")
public class Appuntamento {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private DateTime date;
	private DateTime time;
	//private Boolean flag;
	@ManyToOne
	@JoinColumn(name = "cliente_id")
	private Cliente cliente;
	@ManyToOne
	@JoinColumn(name = "dipendente_id")
	private Dipendente dipendente;
	@ManyToOne
	@JoinColumn(name = "titolare_id")
	private Titolare titolare;
	@ManyToOne
	@JoinColumn(name = "servizio_id")
	private Servizio servizio;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public DateTime getDate() {
		return date;
	}
	public void setDate(DateTime date) {
		this.date = date;
	}
	public DateTime getTime() {
		return time;
	}
	public void setTime(DateTime time) {
		this.time = time;
	}
	public Dipendente getEmployee() {
		return dipendente;
	}
	public void setEmployee(Dipendente dipendente) {
		this.dipendente = dipendente;
	}
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	
	/*public Boolean getFlag() {
		return flag;
	}*/
	/*public void setFlag(Boolean flag) {
		this.flag = flag;
	}*/
	@Override
	public String toString() {
		return "Appuntamento [id=" + id + ", date=" + date + ", time=" + time + ", cliente="
				+ cliente + ", dipendente=" + dipendente + ", titolare=" + titolare + ", servizio=" + servizio + "]";
	}
	
	
	
	

}
