#Autor:johana.giraldo@konexinnnovation.com.co

  Feature: Verificar el login en ventas
    Yo como usuario
    Quiero ingresar a la pagina ventas
    Para verificar el inicio de sesion de diferentes maneras

    @Caso1
      Scenario Outline: Verificar el ingreso correcto con un usuario
      Given que el usuario ingrese a web ventas
      When digita su usuario y contrasenna
        | usuario   | contrasenna   |
        | <usuario> | <contrasenna> |
      And selecciona una papeleria
      Then verifica el ingreso correcto

      Examples:
        | usuario  | contrasenna   |
        | 10101022 | ADATACENTER10 |


    @Caso2
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

      @Caso3
      Scenario Outline: Verificar el ingreso con contraseña o usuario incorrectos
        Given que el usuario ungresa a webventas
        When digita usuario o contrasenna incorrectos
          | usuario   | contrasenna   |
          | <usuario> | <contrasenna> |
        Then verifica el mensaje de error

        Examples:
          | usuario    | contrasenna   |
          | 10101022   | JGIRALDO10    |
          | 1097589765 | ADATACENTER10 |
          | USER       | CONTRASENNA   |
