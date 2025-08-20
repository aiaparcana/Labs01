<%-- 
    Document   : mipagina
    Created on : 17/08/2025, 11:28:14 PM
    Author     : antho
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Operaciones Matemáticas</title>
        <style>
            body {
                font-family: Arial, sans-serif;
                background: #f5f6fa;
                margin: 0;
                padding: 0;
                display: flex;
                justify-content: center;
                align-items: center;
                height: 100vh;
            }

            .container {
                background: #fff;
                padding: 30px;
                border-radius: 12px;
                box-shadow: 0 4px 12px rgba(0,0,0,0.1);
                width: 400px;
                text-align: center;
            }

            h1 {
                margin-bottom: 20px;
                color: #2f3640;
                font-size: 22px;
            }

            form {
                margin-bottom: 20px;
            }

            input[type="number"] {
                width: 80%;
                padding: 10px;
                margin: 8px 0;
                border: 1px solid #ccc;
                border-radius: 8px;
                font-size: 14px;
                transition: border 0.3s;
            }

            input[type="number"]:focus {
                border-color: #0984e3;
                outline: none;
            }

            select {
                width: 85%;
                padding: 10px;
                margin: 10px 0;
                border: 1px solid #ccc;
                border-radius: 8px;
                font-size: 14px;
            }

            input[type="submit"] {
                background: #0984e3;
                color: white;
                border: none;
                padding: 10px 20px;
                border-radius: 8px;
                cursor: pointer;
                font-size: 14px;
                margin-top: 10px;
                transition: background 0.3s;
            }

            input[type="submit"]:hover {
                background: #74b9ff;
            }
        </style>
    </head>
    <body>
        <div class="container">
            <h1>OPERACIONES MATEMÁTICAS</h1>
            
            <form action="miServlet" method="post">
                <input type="number" name="n1" placeholder="Número 1" required />
                <input type="number" name="n2" placeholder="Número 2" required />

                <select name="operacion" required>
                    <option value="suma">Suma</option>
                </select>

                <br>
                <input type="submit" value="Calcular" />
            </form>
        </div>
    </body>
</html>
