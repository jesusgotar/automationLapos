@Reset
Feature: Reinicio de la app

  @Reset
  Scenario: Verificar reseteo de la app
    Given La Pantalla de Inicio de la app ha sido desplegada
    When Reseteo la app
    Then La Pantalla de Inicio de la app ha sido desplegada
