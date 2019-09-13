<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!doctype html>
<html>
<head>
    <title>Hello World Page</title>
</head>
<body>
    <h1>Saying Hello</h1>
    <div>
        <%-- This comment will not be seen in the HTML document, but in the Servlet it will exist --%>
        <%
            String hello = "Hello Beautiful World!";
            setHello(hello);
        %>
        <%!
            String hello;
            public void setHello(String helloMessage) {
                this.hello = helloMessage;
            }
            public String getHello() {
                return this.hello;
            }
        %>
        <%=getHello()%>
    </div>

<jsp:include page="/pages/footer.jsp" />
</body>
</html>
