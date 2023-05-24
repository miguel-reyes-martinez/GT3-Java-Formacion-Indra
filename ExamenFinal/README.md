# Examen Final

Nos contrataron de la Biblioteca Nacional de España para lograr automatizar su sistema de prestación de libros, hoy en día el mismo es un archivo plano que almacena la información de los prestamos de libros a los ciudadanos a lo largo del País. En base a esto, han querido desarrollar un sistema que los ayude a gestionar el inventario, los
prestamos de libros, el vencimiento de estos, y los usuarios también.

La biblioteca presta los libros por 10 días, a partir del día 11 empieza a contar los días de entrega vencida, el sistema debe poder informar cuantos días lleva vencida la entrega, cuanto dinero debe abonar en base a los días de vencimiento y si el cliente entra en mora o no.

El programa debe contar con la siguiente estructura:
- Clases y Herencia (Persona -> Cliente)
- Interfaces
- Manejo de excepciones de archivos

“Días de atraso”:Calcular los días de atraso en base a Fecha de hoy - fecha estipulada de entrega

“Estado Prestamo”: indique si el préstamo esta vencido o no, si el préstamo esta vencido, entonces poner “VENCIDO” si no lo está, porque todavía no se llegaron a los 10 días, informar “EN REGLA”

“Dinero Adeudado”: Calcular el costo que debe abonar el usuario al momento de devolver el libro: por cada día se cobra 1 euro.

“Cliente moroso”: SI/NO, si el estado del préstamo es vencido, entonces, el cliente es moroso, si no lo esta, entonces no lo es.

NO SE PUEDE USAR DO-WHILE

El sistema debe generar un txt de salida informando todos los campos que obtiene del txt de entrada, y,
además, informar los campos agregados. El mismo se debe llamar “inventario_y_vencimientos_fechaHoy”.