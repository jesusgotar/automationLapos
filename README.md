# Mobile Automation

Framework de pruebas. Cuenta con útiles de conexión con bases de datos sql, envío de resultados vía api.
Configuración para multiples plataformas y entornos.              

### Prerequisites

Para ejecutar los test de forma local se requiere lo siguiente:

* Java 8 (Y configurado hava_home)
* Android Studio (con platform tools y android_home configurado)
* Intellij
* Appium
* F5Access o vpn para conectarse con la db/servicios de ser necesario
* Xcode si se desea usar un emulador de iOS
* Un device de la plataforma deseada iOS/Android o un emulador en su defecto.
* Maven instalado y maven_home configurado.

### Installing

1. Clonar el repositorio 
2. Navegar a la rama deseada
3. Levantar emuladores o conectar devices y obtener udid, deviceName, platformVersion, etc.
4. Abrir la carpeta donde se descargo con intellij
5. Configurar los archivos:
    1. serenity.{plataforma}.properties:
        1. deviceName
        2. udid
        3. app (si se requiere)
        4. platformName y version
        5. bundleId
    2. {entorno}.database.properties
6. Abrir appium y levantar el servidor
7. Instalar apk/app o descargar con app de distribucion la versión a testear.
8. Instalar Code Generator Plugin en intellij e importar codegenerator.xml

Con estos pasos ya queda todo listo para desarrollar/correr tests.

## Running the tests

Para correr los test se usa el siguiente comando:

mvn clean verify -DtestPlatform=iOS "-Dcucumber.options=--tags @tag" -DtestEnvironment=database

Donde:

* -DtestPlatform= 'nombre del archivo serenity.properties que se quiere usar, por ejemplo:
                    serenity.iOS.properties pasa a ser iOS'
       
* -DtestEnvironment= 'nombre del entorno donde se correran los tests'
                  
* "-Dcucumber.options=--tags @tag" por ejemplo @login para correr test referidos al login
    
Hay que estar parado en la consola dentro de la carpeta donde se encuentra el proyecto.
              
## Authors

* **Juan Pablo Pisano** - *Initial work & Contributor*
* **Demian Adriel Domínguez** - *Contributor*
