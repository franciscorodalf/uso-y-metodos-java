
 
# Implementación de un Sistema CRUD con Ficheros

## Estructura del Programa
El programa estará compuesto por las siguientes entidades principales:

1. **Interfaz OperacionesIterfaces**: Define los métodos CRUD.
2. **Clase Empleado**: Representa a un empleado con atributos clave.
3. **Clase OperacionesFichero**: Implementa la interfaz y maneja los datos en archivos.
4. **Clase Programa**: Contiene el método `main` y realiza pruebas de las funciones CRUD.

## 1. Interfaz `Operations`
Esta interfaz define los métodos esenciales para la gestión de empleados:

- `create(Empleado empleado)`: Añade un nuevo empleado al archivo.
- `read(String identificador)`: Busca un empleado por su ID.
- `read(Empleado empleado)`: Recupera un empleado por su objeto.
- `update(Empleado empleado)`: Modifica los datos de un empleado existente.
- `delete(String identificador)`: Elimina un empleado del archivo.
- `empleadosPorPuesto(String puesto)`: Devuelve empleados con un puesto específico.
- `empleadosPorEdad(String fechaInicio, String fechaFin)`: Lista empleados dentro de un rango de edad.

## 2. Clase `Empleado`
Esta clase modela a un empleado con los siguientes atributos:

- `identificador`: ID único del empleado.
- `nombre`: Nombre completo.
- `puesto`: Cargo en la empresa.
- `salario`: Salario mensual.
- `fechaNacimiento`: Fecha de nacimiento en formato `dd/mm/aaaa`.

**Métodos implementados:**
- Constructores y métodos `getters` y `setters`.
- `toString()`: Convierte un empleado en una cadena de texto.
- `equals()` y `hashCode()`: Comparación basada en el ID.
- `getEdad()`: Calcula la edad del empleado.
