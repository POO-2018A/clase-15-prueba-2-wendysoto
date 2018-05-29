# Clase-15-Prueba-2

Escriba un programa que permita ingresar la infomación de 5 estudiantes.
- Nombre (string)
- Edad (int)
- Materias (Materia)

Cada estudiante toma 2 materias y se debe ingresar la siguiente información de cada una:
- Nombre (String)
- Nivel (int)

Al terminar de ingresar la información de cada estudiante el programa debe presentar el mensaje: 
"Se ha ingresado el estudiante con los siguientes datos:
Nombre: E1
Edad: 20
Materias: 
  - M1 - 2 nivel
  - M2 - 2 nivel
"
Para esto se debe implementar el método toString.

Al terminar de ingresar toda la lista de estudiantes, el programa debe determinar si existen estudiantes duplicados en la lista, implementar el metodo equals(). Se considera que dos estudiantes son iguales si tienen el mismo nombre, edad y toman exactamente las mismas materias. En el caso de que existan duplicados, debe presentar un mensaje diciendo: 
"Existen duplicados en las posiciones: 1, 3 y 5".
