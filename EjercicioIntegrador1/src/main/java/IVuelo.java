import java.time.LocalDate;

interface IVuelo {
    void esRentable();

    void diasDeDiferencia(LocalDate fechaVuelo);
    void calcularValorFinalPorVuelo();
    
}