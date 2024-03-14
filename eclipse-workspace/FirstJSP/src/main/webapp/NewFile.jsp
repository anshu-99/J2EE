<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
body {
	font-family: Arial, sans-serif;
	background-color: #f0f0f0;
	margin: 0;
	padding: 0;
	display: flex;
	justify-content: center;
	align-items: center;
	height: 100vh;
}

#content {
	background-color: #ffffff;
	padding: 20px;
	border-radius: 8px;
	box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
	max-width: 400px;
	text-align: center;
}

h1 {
	margin-top: 0;
}

p {
	margin-bottom: 10px;
}

.result {
	font-weight: bold;
}

.error {
	color: red;
}
</style>
</head>
<body>
	<div id="content">
		<h1>Calculate</h1>
		<%!
        // Define factorial function
        public static long factorial(int n) {
            if (n == 0 || n == 1) {
                return 1;
            } else {
                return n * factorial(n - 1);
            }
        }
    %>
		<%
            int a = 0, b = 0, c = 0;
            String num1Str = request.getParameter("num1");
            String num2Str = request.getParameter("num2");
            
            if (num1Str != null && num2Str != null) {
                try {
                    a = Integer.parseInt(num1Str);
                    b = Integer.parseInt(num2Str);
                    String opt = request.getParameter("opt");

                    if (opt.equals("add")) {
                        out.println("<p class='result'>Answer: " + (a + b) + "</p>");
                    } else if (opt.equals("sub")) {
                        out.println("<p class='result'>Answer: " + (a - b) + "</p>");
                    } else if (opt.equals("mul")) {
                        out.println("<p class='result'>Answer: " + (a * b) + "</p>");
                    } else if (opt.equals("div")) {
                        if (b != 0) {
                            out.println("<p class='result'>Answer: " + (a / b) + "</p>");
                        } else {
                            out.println("<p class='error'>Division by zero</p>");
                        }
                    } else {
                        out.println("<p class='error'>Invalid Input</p>");
                    }
                } catch (NumberFormatException e) {
                    out.println("<p class='error'>Invalid input. Please enter valid numbers.</p>");
                }
            }
            String numStr = request.getParameter("num");
            if (numStr != null) {
                try {
                    c = Integer.parseInt(numStr);
                    long ans = factorial(c);
                    out.println("<p class='result'>Factorial: " + ans + "</p>");
                } catch (NumberFormatException e) {
                    out.println("<p class='error'>Invalid input for factorial. Please enter a valid number.</p>");
                }
            }
        %>
	</div>
</body>
</html>
