<%@page import="org.example.SavingAccount"%>
<%
SavingAccount savAcc = new SavingAccount(5000.0);
%>

<h2>The balance is <%=savAcc.displayBalance() %></h2>