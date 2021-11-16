@feedback
Feature: Verificar pantallas de inicio  de la app

  @feedbackPositivo
  Scenario: feedback positivo
    Given Que la app de ayuda esta abierta
    When Hago tap sobre el campo de texto a buscar
    And Escribo el texto 'Calculadora' en el campo de texto a buscar
    And Espero la cantidad de '5' segundos
    And Hago tap sobre el primer resultado
    And Espero la cantidad de '5' segundos
    And Hago tap sobre el boton de respuesta util 'positiva'
    And Se muestra el mensaje agradecimiento
    And Espero la cantidad de '10' segundos

  @feedbackNegativo
  Scenario: feedback negativo
    Given Que la app de ayuda esta abierta
    When Hago tap sobre el campo de texto a buscar
    And Escribo el texto 'Cuotas' en el campo de texto a buscar
    And Espero la cantidad de '5' segundos
    And Hago tap sobre el primer resultado
    And Espero la cantidad de '5' segundos
    And Hago tap sobre el boton de respuesta util 'negativa'
    And Hago tap en el check de informacion consusa o incompleta
    And Espero la cantidad de '5' segundos
    And Escribo el texto 'Comentario sobre el servicio' en el campo detalles
    And Espero la cantidad de '5' segundos
    And Hago tap en el boton enviar feedback
    And Espero la cantidad de '15' segundos