<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Form</title>
</head>
<body>
<form action="kredyt" method="post">





	<label>Kwota kredytu:<input type="text" id="kwota" name="kwota"/></label><br/><br/>
	<label>Ilosc rat:<input type="text" id="raty" name="raty"/></label><br/><br/>
	<label>Oprocentowanie:<input type="text" id="proc" name="proc"/></label><br/><br/>
	<label>Oplata stala:<input type="text" id="oplata" name="oplata"/></label><br/><br/>
	Rodzaj rat:<br/>
	
	<label>Stala<input type="radio" name="rodzaj" value="stala"/></label><br/>
	<label>Malejaca<input type="radio" name="rodzaj" value="malejaca"/></label><br/><br/>
	<input type="submit" value="wyslij"/>
</form>

</body>
</html>