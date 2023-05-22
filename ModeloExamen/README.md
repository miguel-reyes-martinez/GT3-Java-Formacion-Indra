# Modelo de Examen

La empresa Microsoft ha contratado nuestros servicios para desarrollar un completo sistema de gestión de recursos humanos en Java. Su objetivo principal es automatizar el proceso de registro, seguimiento y cálculo de salarios de los empleados.

Toda la información se debe generar por consola:
- Nombre del empleado
- Apellido del empleado
- Fecha de ingreso
- Fecha de salida
- Sexo
- Ciudad
- Posición (Tipo enum)
- Salario base

El sistema debe tener la capacidad de generar la siguiente información:
- Salario final
- Antigüedad laboral
- Rotación

El sistema debe contar con una jerarquía de clases bien estructurada que incluya una interfaz 'Empleado', la cual deberá tener métodos clave como 'calcularSalario', Rotación recomendada y Antigüedad Laboral.

Calculo de antigüedad laboral: fecha actual – fecha de ingreso
Salario final: Salario base * 0.83
Rotación recomendada: Si el puesto es de Ingeniero && La antigüedad es mayor o igual a 2 años => Rotación habilitada
Rotación recomendada: Si el puesto es de Ingeniero && La antigüedad es menor o igual a 2 años => Rotación no habilitada

Además de la gestión de empleados, el sistema debe generar la información de los empleados en un fichero de salida con formato .json