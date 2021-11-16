@MyFirstTest
Feature: Verificar pantallas de inicio  de la app

  @MyFirstTest
  Scenario: Verificar pantalla de inicio
    Given Que esta abierta la app
    When Hago tap sobre un boton
    Then La app cambia de estado

  @MySecondTest
  Scenario: Verificar pantalla de inicio
    Given Que esta abierta la app
    When Hago tap sobre un boton
    When Hago tap sobre el campo de texto a buscar
    Then La app cambia de estado