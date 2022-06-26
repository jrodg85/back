# Definición de Proyecto Individual

## Nombre de la Aplicación

"InmoGuanche CRM".

## Autor

Cap. CGET. Tra. José Enrique Rodríguez González.

## Descripción

La aplicación a realizar tiene como objetivo la gestión y supervision de propiedades inmobiliarias. A través de ella se podrá realizar estadísticas de las ofertas de los inmuebles.

Esta aplicación será a traves de interfaz web.

## Diagrama de clases de diseño

![Diagrama de diseño](https://git.institutomilitar.com/jrodg85/InmoGuanche-CRM/-/wikis/img/001-Esquema-UML-20220327.png)

**Cumplimiento de los requisitos del proyecto**.

1. **Herencia**: En la figura del apartado anterior se puede observar la herencia sobre `Oferta`y sus subtipos `Oferta de Alquiler` y `Oferta de Venta`
2. **Relación One-To-Many**: La relación se observa entre `Vivienda` y `Oferta`.
3. **Método personalizado**: Un usuario podrá obtener las `Oferta` filtradas un precio máximo por metro cuadrado de `Venta` o precio por metro cuadrado de cuota mensual de `Alquiler` determinados por el usuario.
Por ejemplo podrá filtrar las ofertas de vivienda que tengan un precio por debajo de 800€ el metro cuadrado de precio de `Venta`.
4. **Listado**: Seleccionando previamente una vivienda, Se mostrará el listado de las ofertas relativas a la citada vivienda. Véase [Figura 1](#figura-1).
5. **CRUD**: Véase [Figura 1](#figura-1) donde se puede ver el icono de modificar, leer y borrar `Oferta` de una `Vivienda`Que ya tiene ofertas, vivienda y, por otro lado, la opción de crear ofertas en una `Vivienda` que no tiene ninguna `Oferta` asociada. Véase [Figura 2](#figura-2) donde se pueden ver los formularios para crear `Oferta`.
6. **URL's del proyecto**:

    1. *Repositorio del proyecto*: <https://git.institutomilitar.com/jrodg85/InmoGuanche-CRM>.
    2. *Librería*: https://github.com/jrodg85/jrodg85-RealEstate

7. **Despliegue en Internet**:

    1. *API*: **https://inmoguanchecrm.herokuapp.com/api**
    2. *Web*: **https://inmoguanchecrm.netlify.app//**

## Interfaz de usuario

### Figura 1

![Figura 1](https://git.institutomilitar.com/jrodg85/InmoGuanche-CRM/-/wikis/img/CRUD2.png)

### Figura 2

![Figura 2](https://git.institutomilitar.com/jrodg85/InmoGuanche-CRM/-/wikis/img/002-new.png)
