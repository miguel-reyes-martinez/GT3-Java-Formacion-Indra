import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Vuelo extends Empresa implements IVuelo {
    private int cantPasajeros;
    private String tipoPasaje;
    private String nombreVuelo;
    private double valorUnitario;
    private LocalDate fechaVuelo;
    private double valorFinalPorVuelo;
    private int diasDeDiferencia;
    private String segmentacion;

    public Vuelo(String nombre, int cantPasajeros, String tipoPasaje, double valorUnitario, LocalDate fechaVuelo) {
    	super.setNombre("Iberia");
        this.nombreVuelo = nombre;
        this.cantPasajeros = cantPasajeros;
        this.tipoPasaje = tipoPasaje;
        this.valorUnitario = valorUnitario;
        this.fechaVuelo = fechaVuelo;
    }

    
    public void calcularValorFinalPorVuelo() {
        this.valorFinalPorVuelo = this.valorUnitario * this.cantPasajeros;
    }

    
    public void diasDeDiferencia(LocalDate fechaActual) {
        this.diasDeDiferencia = (int) ChronoUnit.DAYS.between(this.fechaVuelo, fechaActual);
    }

    
    public void esRentable() {
        if (this.tipoPasaje.equals("ECONOMICO") && this.valorFinalPorVuelo > 100) {
            this.segmentacion = "RENTABLE";
        } else if (this.tipoPasaje.equals("ECONOMICO") && this.valorFinalPorVuelo < 100) {
            this.segmentacion = "NO RENTABLE";
        } else if (this.tipoPasaje.equals("PREMIER") && this.valorFinalPorVuelo > 1500) {
            this.segmentacion = "RENTABLE";
        } else if (this.tipoPasaje.equals("PREMIER") && this.valorFinalPorVuelo < 1500) {
            this.segmentacion = "NO RENTABLE";
        } else {
            this.segmentacion = "A CONFIRMAR";
        }
    }

    

    public String toString() {
        return String.format("%-20s %-20s %-20d %-20s %-20.2f %-20s %-20d %-20s %-20s", super.getNombre(), 
            this.nombreVuelo, this.cantPasajeros, this.tipoPasaje, this.valorUnitario, this.fechaVuelo.toString(), 
            this.diasDeDiferencia,this.valorFinalPorVuelo, this.segmentacion);
    }
}
