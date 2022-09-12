<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="ISO-8859-1"%>

<jsp:include page="/WEB-INF/vistas/template_superior.jsp"></jsp:include>





<form class="form-signin">
  <div class="text-center mb-4">
    <img class="mb-4" src="/docs/4.6/assets/brand/bootstrap-solid.svg" alt="" width="72" height="72">
    <h1 class="h3 mb-3 font-weight-normal">Login</h1>
   
  </div>

  <div class="form-label-group">
    <input type="email" id="inputEmail" class="form-control" placeholder="Email address" required autofocus>
    <label for="inputEmail">Email address</label>
  </div>

  <div class="form-label-group">
    <input type="password" id="inputPassword" class="form-control" placeholder="Password" required>
    <label for="inputPassword">Password</label>
  </div>


  <button class="btn btn-lg btn-primary btn-block" type="submit"><a href="/login">Sign in</a></button>
  <p class="mt-5 mb-3 text-muted text-center">&copy; 2017-2022</p>
</form>
	

<jsp:include page="/WEB-INF/vistas/template_inferior.jsp"></jsp:include>