<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<jsp:useBean id="parameters" class="Domain.LoanParameters" scope="session" />
<jsp:setProperty property="*" name="parameters"/>
Numer wniosku: ${loan.number} <br/>
Wnioskowana kwota ${parameters.amount}
<form action="address.jsp">
<label>Imie:<input type="text" id="firstName" name="firstName" /></label></br>
<label>Nazwisko:<input type="text" id="surname" name="surname" /></label></br>
<label>Pesel:<input type="text" id="pesel" name="pesel" /></label></br>
<label><input type="submit" value="nastepny krok" />
</form>
</body>
</html>