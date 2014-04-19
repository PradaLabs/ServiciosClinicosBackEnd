var app = angular.module("OdontoCLinicManager", ['ui.bootstrap']);


app.controller("OdontoCLinicManagerCtrl",function ($scope , $http , $location) {

	$scope.vistas = ['vistaOperaciones', 'vistaPaciente','vistaAgendaDetallada','vistaReportes','vistaCaja','vistaAdministrarClinica'];
	$scope.vistaSeleccionada = $scope.vistas[0];//Vista seleccionada por default;
	
	
	$scope.clinica={pacientes :   [
	                               {primernombre: "juanda",
	                                dssegundonombre: "david",
	                                  dsprimerApellido: "caicedo",
	                                   dssegundoapellido: "reyes"
	                               },

	                               {primernombre: "andres",
	                                dssegundonombre: "guillermo",
	                                  dsprimerApellido: "Prada",
	                                   dssegundoapellido: "Reyes"
	                               }
	                           ]};
	
	$scope.seleccionarVista= function (numerodeVista){
		$scope.vistaSeleccionada = $scope.vistas[numerodeVista];
	}
	 $scope.paginaSigOut = function(){
		   console.log($location.absUrl());
		   window.location.assign($location.path()+"CerrarSesionGoogle");
	  }
	 $scope.traerinformacionTableroPrincipal= function(){
		 
	 } 
	 
});

