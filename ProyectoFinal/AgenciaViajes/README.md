# AgenciaViajes - API REST

Este proyecto esta centrado en una agencia de viajes, en la cual tu puedes generar una reserva de hotel y vuelo simultaneamente, ver todas las reservas e incluso todas las reservas de un unico hotel. La aplicación utiliza una base de datos MySQL y expone sus funcionalidades a través de una API REST que se muestran a traves del navegador.

## Características Principales

- Conexión a una base de datos MySQL.
- Relaciona el microservicio reserva con el microservicio de vuelo y con el microservicio de hotel.
- Exposición de endpoints para interactuar con todas las entidades.

# Entidades

1. **Vuelo**: Representa a un vuelo.
2. **Hotel**: Representa a un hotel.
3. **Reserva**: Representa a una reserva, que contiene el id de un vuelo y un hotels.

# Servicio Reserva

A partir de una tabla de mysql que contiene todas las reservas, se crean los siguientes recursos

# Servicio Vuelo

A partir de una tabla de mysql que contiene todos los vuelos, se crean los siguientes recursos

# Servicio Hotel

A partir de una tabla de mysql que contiene todos los hoteles, se crean los siguientes recursos

# Funcionalidades
1. **Listar todas las reservas**
2. **Crear una nueva reserva**
3. **Buscar reservas por nombre de hotel**
4. **Listar todos los hoteles**
5. **Listar todos los hoteles disponibles**
6. **Buscar hotel por nombre**
7. **Listar todos los vuelos**
8. **Buscar vuelo por su id**
9. **Listar todos los vuelos que tengan mas que un 	numero de plazas**
10. **Actualizar num plazas del vuelo por el id del vuelo**


## Endpoints

### Reserva

1. **Listar todas las reservas**
   - **URL**: `/reserva`
   - **Método**: `GET`

2. **Crear una nueva reserva**
   - **URL**: `/reserva`
   - **Método**: `POST`

3. **Buscar reservas por nombre de hotel**
   - **URL**: `/reserva/{nombreHotel}`
   - **Método**: `GET`
   
### Hotel

4. **Listar todos los hoteles**
   - **URL**: `/hoteles`
   - **Método**: `GET`

5. **Listar todos los hoteles disponibles**
   - **URL**: `/hoteles/disponibles`
   - **Método**: `GET`

6. **Buscar hotel por nombre**
   - **URL**: `/hoteles/{nombre}`
   - **Método**: `GET`
   
### Vuelo

7. **Listar todos los vuelos**
   - **URL**: `/vuelos`
   - **Método**: `GET`

8. **Buscar vuelo por su id**
   - **URL**: `/vuelos/vuelo/{id}`
   - **Método**: `GET`

9. **Listar todos los vuelos que tengan mas que un 	numero de plazas**
   - **URL**: `/vuelos/{numPlazas}`
   - **Método**: `GET`
   
10. **Actualizar num plazas del vuelo por el id del vuelo**
   - **URL**: `/vuelos/{idVuelo}/{numPlazas}`
   - **Método**: `PUT`