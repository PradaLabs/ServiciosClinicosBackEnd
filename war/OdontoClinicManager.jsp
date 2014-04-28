<!doctype html>
<html>
<head>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, maximum-scale=1, initial-scale=1, user-scalable=0">

  <!-- Always force latest IE rendering engine or request Chrome Frame -->
  <meta content="IE=edge,chrome=1" http-equiv="X-UA-Compatible">

  <link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Open+Sans:400,600,800">

  <!-- Use title if it's in the page YAML frontmatter -->
  <title>Odonto Clinic soft Manager</title>
  	 <script src="http://ajax.googleapis.com/ajax/libs/angularjs/1.2.8/angular.min.js"></script>
  	 <link href="//netdna.bootstrapcdn.com/bootstrap/3.0.3/css/bootstrap.min.css" rel="stylesheet">
  	 <script src="http://angular-ui.github.io/bootstrap/ui-bootstrap-tpls-0.10.0.js"></script>
  	 <script src="/Recursos/bootstrap/ui-bootstrap-tpls-0.10.0.min.js" type="text/javascript"></script>	 
  	 <link href="../../stylesheets/application.css" media="screen" rel="stylesheet" type="text/css" />
   	 <script src="/Recursos/js/AplicionAngular.js" type="text/javascript"></script>
	 <script src="/Recursos/js/OdontoCLinicManager.js" type="text/javascript"></script>
	 <script src="/Recursos/js/Paciente.js" type="text/javascript"></script>
	 <!-- <script src="../../javascripts/application.js" type="text/javascript"></script> -->
</head>

<body  ng-app="OdontoCLinicManager" ng-controller="OdontoCLinicManagerCtrl">

<ng-include src="'/Recursos/html/tableroPrincipal/HeaderPrincipal.jsp'"></ng-include> 
<div class="sidebar-background">
  <div class="primary-sidebar-background"></div>
</div>
<ng-include src="'/Recursos/html/tableroPrincipal/opcionesTableroPrincipal.jsp'"></ng-include> 
<div ng-switch="vistaSeleccionada.valor">
	<div ng-switch-when="vistaOperaciones" ng-init="traerinformacionTableroPrincipal()">
		<ng-include src="'/Recursos/html/TableroPrincipal.jsp'"></ng-include>
	</div>
	<div ng-switch-when="vistaPaciente" >
		<ng-include src="'/Recursos/html/Paciente.jsp'"></ng-include>
	</div>
	<div ng-switch-when="vistaPacienteDetalle" ng-init="inicilizarInformacionPaciente()">
		<ng-include src="'/Recursos/html/paciente/PacienteDetalle.jsp'"></ng-include>
	</div>
	
</body>

</html>
