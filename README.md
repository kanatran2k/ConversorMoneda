# Mi Conversor de Monedas
**Desarrollado para Desafío Alura** *por Nelson Torres*

**Aplicación de consola para Java** que permite convertir entre monedas internacionales utilizando tasas de cambio en tiempo real. 
Ideal para usuarios que necesitan hacer conversiones rápidas.

---

## 📌 Descripción

Este convertidor de monedas es una herramienta interactiva desarrollada en **Java**, que permite al usuario realizar conversiones entre 6 distintas divisas mediante una interfaz de menú sencilla. 
Al iniciar, el programa da la bienvenida al usuario y muestra un **menú con 6 opciones de monedas** para elegir tanto la moneda de origen como la de destino.
El usuario ingresa un monto y recibe inmediatamente el resultado de la conversión. 
Para salir, basta con ingresar la opción **8**, momento en el que el sistema muestra un mensaje de despedida simple.

Además, **cada conversión se registra automáticamente** en un Arreglo de Historial para llevar un control detallado del usuario.

---

## 🔑 Características Principales

- **Bienvenida personalizada**: Mensaje inicial claro y amigable al iniciar la aplicación.
- **Menú interactivo con 6 monedas**: Selección numerada de monedas de origen y destino.
- **Conversión dinámica en tiempo real**:
  - Ingreso de monto a convertir.
  - Resultado detallado: `Moneda Origen → Moneda Destino `.
- **Flujo continuo**: Permite realizar múltiples conversiones sin reiniciar la aplicación.
- **Finalización controlada**: Al ingresar la opción **8**, el programa termina mostrando:  
- - **Manejo de excepciones**:
  - Control de errores en la conexión a la API.
---

## 🛠️ Tecnologías Utilizadas

| Componente         | Detalle |
|--------------------|---------|
| **Lenguaje**        | Java 25 (`jdk-25.0.1`) |
| **API de Tasas**    | [ExchangeRate-API](https://www.exchangerate-api.com/) |
| **IDE**             | IntelliJ IDEA Community |
| **Control de versiones** | Git y GitHub |
| **Sistema Operativo** | Windows 11 |
| **Librerías Java**  | `Scanner`, `FileWriter`, `FileReader`, `Gson` (para JSON), manejo de excepciones personalizadas |
| **Conceptos aplicados** | Clases, encapsulamiento, herencia, bucles (`do-while`), manejo de arrays, getters/setters, validaciones|

---

## 🚀 Cómo Usarlo

1. Clona el repositorio: git clone https://github.com/kanatran2k/ConversorMoneda.git
2. Abre el proyecto en tu IDE de Java (recomendado: IntelliJ IDEA).
3. Asegúrate de tener conexión a internet para acceder a la API de tasas de cambio.
4. Ejecuta la clase principal y sigue las instrucciones en pantalla.


📬 Contacto
Escrito por Nelson Torres
📧 Correo: nelson.torres.lagos@gmail.com


