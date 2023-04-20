#Autor:johana.giraldo@konexinnnovation.com.co
  #language:es

@HuLogin
Característica: Verificar el login en ventas
  Yo como usuario
  Quiero ingresar a la pagina ventas
  Para verificar el inicio de sesion de diferentes maneras

  @Caso1
  Esquema del escenario: : Verificar el ingreso correcto con uno o diferentes usuarios
    Dado que el usuario ingresa a webventas
    Cuando digita usuario y contrasenna
      | usuario   | contrasenna   |
      | <usuario> | <contrasenna> |
    Y selecciona papeleria
      | papeleria   |
      | <papeleria> |
    Entonces verifica que ingreso correctamente

    Ejemplos:
      | usuario     | contrasenna   | papeleria    |
      | 10974074492 | JGIRALDO10    | WEB1-0010501 |
      | 10101022    | ADATACENTER10 | DAN-0007501  |

  @Caso2
  Esquema del escenario: : Verificar el ingreso de un usuario de manera erronea
    Dado que el usuario ingresa a webventas
    Cuando digita usuario y contrasenna
      | usuario   | contrasenna   |
      | <usuario> | <contrasenna> |
    Entonces verifica el mensaje de error
      | mensajeError   |
      | <mensajeError> |

    Ejemplos:
      | Descripcion                      | usuario      | contrasenna   | mensajeError                                                  |
      | Contraseña incorrecta            | 10101022     | JGIRALDO10    | El Usuario y la Contraseña que ingresó no ha sido reconocido  |
      | usuario incorrecto               | 1097589765   | ADATACENTER10 | El Usuario y la Contraseña que ingresó no ha sido reconocido  |
      | usuario y contraseña incorrectos | USER         | CONTRASENNA   | El Usuario y la Contraseña que ingresó no ha sido reconocido  |
      | usuario inactivo                 | 3227077412   | PPAPELERIA32  | El usuario no se encuentra activo en el sistema.              |
      | rol inactivo                     | 200423       | PINACTIVO20   | El usuario no tiene un rol activo en el sistema.              |
      | asesor sin papeleria             | 1097039654   | LCANON10      | No se encontró papelería asociada al asesor.                  |
      | usuario sin horario              | 123456123456 | CAPELLIDO12   | No tiene programación de horario para la hora especifica.     |
      | empresa no asociada              | 24824010     | CARIAS24      | El asesor no tiene una empresa asociada para gestionar ventas |





