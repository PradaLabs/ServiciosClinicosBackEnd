var app = angular.module("Login", []);


app.controller("LoginCtrl",function ($scope , $http , $location) {
	
	var ctx = "<%=request.getContextPath()%>";
	$scope.datos="Envio datos del cliente";
	$scope.user='';
	$scope.password='';
   $scope.paginaLogueoGoogle = function(){
	   console.log($location.absUrl());
	   window.location.assign("/InformacionProducto")
	   
   }
   $scope.servicioAutenticaciongoogle=function (){
	   if($scope.user != '' && $scope.user != ''){
	   httpContext.Current.Response.AddHeader("user",$scope.user);
	   httpContext.Current.Response.AddHeader("pass",$scope.password);
	   window.location.assign("/OdontoClinicManager.jsp");
	   }
//	   $http.post("rest/OdontoClinic/post", {"foo":"bar"})
//	   .success(function(data, status, headers, config) {
//	       $scope.data = data;
//	       console.log(data);
//	   }).error(function(data, status, headers, config) {
//	       $scope.status = status;
//	   });
   }
   
});

