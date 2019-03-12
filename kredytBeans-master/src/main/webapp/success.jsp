<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
         <%@ page import="Domain.LoanApplication" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<jsp:useBean id="loanService" class="service.LoanService" scope="application"/>
<jsp:useBean id="loan" class="Domain.LoanApplication" scope="session"/>
<jsp:useBean id="parameters" class="Domain.LoanParameters" scope="session"/>
<jsp:useBean id="person" class="Domain.Person" scope="session"/>
<jsp:useBean id="address" class="Domain.Address" scope="session"/>

<jsp:setProperty property="*" name="address"/>
<%
loan.setParameters(parameters);
loan.setPerson(person);
loan.setAddress(address);
loanService.add(loan);
%>
<ul>
<%
	for(LoanApplication loanApplication:loanService.getAll())
	{
		
	
%>
<li> Wniosek <%=loanApplication.getNumber() 
						+"Osoba:"+loanApplication.getPerson().getSurname() 
						+" Kwota:"+loanApplication.getParameters().getAmount()
						+" Miasto"+loanApplication.getAddress().getCity() 
						+"Dane zamieszkania"+loanApplication.getAddress().getZipCode() + " ul."+loanApplication.getAddress().getStreet()+ " "+loanApplication.getAddress().getHouseNumber()+"/"+loanApplication.getAddress().getLocalNumber()
						%>
						</li>
					<%
	}
					%>
</ul>


</body>
</html>