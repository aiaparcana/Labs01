<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"> 
        <title>Numero Mayor o Menor</title>
        <style>
            body {
                font-family: Arial, sans-serif;
                background: #f4f4f9;
                display: flex;
                justify-content: center;
                align-items: center;
                height: 100vh;
                flex-direction: column;
            }
            form {
                background: #fff;
                padding: 20px;
                border-radius: 10px;
                box-shadow: 0 4px 6px rgba(0,0,0,0.1);
                width: 300px;
            }
            h1 {
                text-align: center;
                font-size: 20px;
                color: #333;
            }
            label {
                display: block;
                margin-top: 10px;
                font-weight: bold;
                color: #555;
            }
            input[type="text"] {
                width: 100%;
                padding: 8px;
                margin-top: 5px;
                border: 1px solid #ccc;
                border-radius: 5px;
                box-sizing: border-box;
            }
            .botones {
                margin-top: 15px;
                display: flex;
                gap: 10px;
            }
            input[type="submit"] {
                flex: 1;
                padding: 10px;
                background-color: #4CAF50;
                border: none;
                border-radius: 5px;
                color: white;
                font-size: 16px;
                cursor: pointer;
            }
            input[type="submit"]:hover {
                background-color: #45a049;
            }
            .resultado {
                margin-top: 20px;
                padding: 10px;
                background: #e8f5e9;
                border-radius: 5px;
                text-align: center;
                width: 300px;
                box-shadow: 0 4px 6px rgba(0,0,0,0.1);
            }
        </style>
    </head>
    <body>
        <form action="miServlet" method="post">
            <h1>NUMERO MAYOR O MENOR</h1>
            
            <label for="var1">Número 1:</label>
            <input type="text" id="var1" name="variable1" placeholder="Ingrese el primer número">

            <label for="var2">Número 2:</label>
            <input type="text" id="var2" name="variable2" placeholder="Ingrese el segundo número">

            <label for="var3">Número 3:</label>
            <input type="text" id="var3" name="variable3" placeholder="Ingrese el tercer número">

            <label for="var4">Número 4:</label>
            <input type="text" id="var4" name="variable4" placeholder="Ingrese el cuarto número">

            <div class="botones">
                <input type="submit" name="accion" value="Mayor">
                <input type="submit" name="accion" value="Menor">
                <input type="submit" name="accion" value="Promedio">
            </div>
        </form>

        <!-- Aquí se muestra el resultado cuando el servlet reenvía -->
        <c:if test="${not empty resultado}">
            <div class="resultado">
                <strong>Resultado:</strong> ${resultado}
            </div>
        </c:if>
    </body>
</html>
