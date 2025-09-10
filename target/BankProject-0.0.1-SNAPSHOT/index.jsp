<%@page import="org.example.SavingAccount"%>
<%
SavingAccount savAcc = new SavingAccount(5000.0);
savAcc.withdraw(1000);
%>

<h2>The balance is <%=savAcc.displayBalance() %></h2>
<%
savAcc.withdraw(1000);
%>
<h2>The balance after withdrawal is <%=savAcc.displayBalance() %></h2>