# Hotel

## Planteamiento inicial

### Tipos de habitaciones
- Indivduales
- Dobles con cama única
- Dobles con cama de matrimonio.
- Sala de conferencias (Aforo máximo de 45 personas)

Para el diseño, se presupone que no hay camas supletorias, y que en el máximo de personas es 1 para individual,
2 para los dos tipos de habitaciones dobles.

### Reservas
No hay hora para el registro de llegada, pero el último día el cliente deberá hacer el registro de
salida las 12:00AM como máximo
Una reserva contiene la siguiente información del cliente:
* DNI de la(s) persona(s) que pernoctan.
* Fecha de inicio y fin.
* ID de reserva.
* Estado de una reserva:
    * Pagado. (Si está pagada, es que se ha confirmado la reserva)
    * Pendiente de cobro / confirmación.
    * Cancelado

### Plazas de Parking
1 reserva de habitación puede añadir como extra 1 plaza de parking. 1 reserva, 1 plaza como máximo.
Datos necesarios de los vehículos:
- Matrícula de coche


### Personal
Por simplificación, sólo se tendrá en cuenta el personal de limpieza y de mantenimiento como un solo equipo.
A partir de las 10 AM se realizarán

## Funcionamiento del programa

Se realizará la reserva con un menú por CLI.

## Requirimientos técnicos

* OpenJDK 21.X (LTS) o superior.
* Postgres 17.X.