# Ejercicio 6

Nos contrataron de la empresa aeronáutica Iberia para poder estandarizar y sistematizar la información que tienen hoy en día en un TXT 

- Nombre del vuelo 
- Cantidad de pasajeros 
- Tipo de pasaje 
- Valor unitario del pasaje 
- Fecha del vuelo 

Generar una salida que calcule lo siguiente: 

- ValorFinalPorVuelo = ValorUnitario * Cant Pasajeros 
- DiasDeDiferencia = Fecha Actual – Fecha Vuelo 
- Segmentación:
    * Si Tipo_pasaje = Económico && ValorFinalPorVuelo > 100 Entonces es Rentable 
    * Si Tipo_pasaje = Económico && ValorFinalPorVuelo < 100 Entonces es No Rentable 
    * Si Tipo_pasaje = Premier && ValorFinalPorVuelo > 1500 Entonces es Rentable 
    * Si Tipo_pasaje = Premier && ValorFinalPorVuelo < 1500 Entonces no es Rentable 
    * Para los que no estén dentro de estas definiciones, el mensaje debe ser "A CONFIRMAR" 

Además, agregar una línea que contabilice el Monto Final recaudado total entre la suma de todos los montos parciales.

El programa debe implementar lo siguiente: 
- Clases y herencia 
- Interfaz (Con las funciones que generen el enunciado) 

**DEBE GENERAR UN FICHERO DE SALIDA CON LO PROVISTO EN EL TXT Y CON LO AGREGADO DENTRO DEL PROGRAMA**
