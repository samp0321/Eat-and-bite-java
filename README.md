## 🥗 Eat and Bite

La aplicación de Eat and Bite le ofrece a los usuarios ingresar sección para comprar productos entre un catalogo ofrecido por nuestra aplicación, productos que podra comprar sin limite. El usuario tendra que realizar un pago con tarjeta y recibira una factura de compra con los productos, el total y su dirección de domicio ingresada. Además, el pograma ofrece un cupon de descuento para aquellos nuevos usuarios. 

# 👥 Integrantes:

- Samuel Pulgarin Chavarria
- Michell Paola González Comas

# 📘 Manual de usuario: 
La aplicación de Eat and Bite permite a nuestros clientes ingresar a nuestra plataforma de compra de productos, para esto tendran que iniciar sección o registrarse. Aquellos que se registren, obtendran un cupon de un 10% en su compra. Al inciar sección o registrarse, al usuario le aparecera nuestro menu, en el cual podra elegir cualquiera de nuestras opciones, sin limite y los productos que desee. Al usuario terminar su selección de productos, tendra que poner datos de una tarjeta de credito (falsa) la cual, permitira al usuario realizar la compra. Al ingresar los datos de la tarjeta, el usuario tendra un limitante, y debera de poner la contraseña de su cuenta para continuar, en caso de ser la contraseña erronia la venta se cancelara y se cerrara el programa. Tras ingresar la contraseña y si la misma es correcta, el usuario podra ingresar un cupon de descuento, el cual es uno unico que es: BMDFK10. Si el usuario elige no tener ningun código de descuento, la compra continuara normalmente; si el usuario elige el código de descuento pero lo ingresa erroneamente el código será invalidado y se continuara la compra normalmente; si el usuario elige y coloca el código de descuento correctamente, la compra se continuara con un 10% de descuento. Por ultimo el usuario podra ingresar una dirección de domicilio para finalmente recibir su factura de compra con la información de los productos, el total y dirección de entrega. 

# 🤔 Funcionamiento:

La aplicación importa lo siguiente: 

- import java.util.Scanner; : El Scanner nos ayuda a leer la información que el usuario escribe en la consola, como lo es su nombre de usuario, contraseña, productos seleccionado y entre otros.
- import java.util.ArrayList; : El ArrayList nos ayuda a guardar y organizar nuestra lista de productos con sus respectivos precios en la memoria del programa.

⚡Código: 

- System.out.print : Nos ayuda a imprimir el texto para el usuario y es bastante utilizado en el programa.
- int, String : Nos ayuda a almacenar datos que el cliente le da al programa.
- Switch: El Switch le ayuda al cliente eligir entre las opciones que ofrece el programa, como lo es iniciar sección o registrarse, este acomparado de case 1, 2, 3 un default para otras opciones y un break al final de cada caso.
- Thread.sleep(); : Lo usamos para generar un pequeño tiempo de espera, esto para añadirle un toque al programa.
- for: Nos permite ahorrar código al automatizar la tarea de recorrer la lista.
- While: Nos permite tener un bucle activo, el cual le sirve al cliente para añadir los productos que quiera al carrito.
- if: Nos genera casos donde el cliente si cumple ciertas condiciones, el cliente tendra o recibira un dato. Un ejemplo es el cupon, el cual si el cliente no lo ingresa, será invalido. Este se acompaña con un else.

# 📖 Diagrama de flujo

Link: https://mermaid.ai/d/5c465687-7aa0-48c9-88d3-3b254afaf183
