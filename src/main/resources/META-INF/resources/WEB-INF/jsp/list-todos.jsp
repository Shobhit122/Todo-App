<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>


<html>
        <head>
            <title>Todos Page</title>

            <link href="webjars/bootstrap/5.1.3/css/bootstrap.min.css" rel="stylesheet" >



        </head>
        <body>
        <div class="container">
            <form method="post">
                <h1>Your todos</h1>
            </form>

            <table class="table">
            <thead>
                <tr>
                    <th>Description</th>
                    <th>Target Date</th>
                    <th>Done</th>
                    <th></th>
                    <th></th>

                </tr>
             </thead>
             <tbody>
                <c:forEach items="${todos}" var="todo">
                    <tr>
                        <td>${todo.description}</td>
                        <td>${todo.targetDate}</td>
                        <td>${todo.done}</td>
                        <td><a href="delete-todo?id=${todo.id}" class="btn btn-warning">Delete</a></td>
                        <td><a href="update-todo?id=${todo.id}" class="btn btn-dark">Update</a></td>

                    </tr>
                </c:forEach>
             </tbody>

            </table>


        <a href="add-todo" class="btn btn-success">Add Todo</a>
        </div>
            <script src="webjars/bootstrap/5.1.3/js/bootstrap.min.js"></script>
            <script src="webjars/jquery/3.6.0/jquery.min.js"></script>
        </body>


</html>