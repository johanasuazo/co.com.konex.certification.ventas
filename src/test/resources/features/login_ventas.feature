#Autor:johana.giraldo@konexinnnovation.com.co

  Feature: Verificar el login con diferentes usuarios
    Yo como usuario
    Quiero ingresar a la pagina ventas
    Para verificar el inicio de sesion con diferentes usuarios

  @Caso1
  Scenario Outline: Verificar el ingreso correcto con diferentes usuarios
    Given que el usuario ingresa a webventas
    When digita usuario y contrasenna
      | usuario   | contrasenna   |
      | <usuario> | <contrasenna> |
    And selecciona papeleria
    Then verifica que ingreso correctamente

    Examples:
      | usuario     | contrasenna   |
      | 10974074492 | JGIRALDO10    |
      | 10101022    | ADATACENTER10 |