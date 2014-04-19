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

  
  
  <script src="../../javascripts/application.js" type="text/javascript"></script>
 
 
  <link href="../../stylesheets/application.css" media="screen" rel="stylesheet" type="text/css" />
   <script src="http://ajax.googleapis.com/ajax/libs/angularjs/1.2.8/angular.min.js"></script>
   <script src="http://angular-ui.github.io/bootstrap/ui-bootstrap-tpls-0.10.0.min.js"></script> 
   
<script src="/Recursos/js/OdontoCLinicManager.js" type="text/javascript"></script>
<script src="/Recursos/js/Paciente.js" type="text/javascript"></script> 
 
  
</head>



<body  ng-app="OdontoCLinicManager" ng-controller="OdontoCLinicManagerCtrl">
<nav class="navbar navbar-default navbar-inverse navbar-static-top" role="navigation">
  <!-- Brand and toggle get grouped for better mobile display -->
  <div class="navbar-header">
    <a class="navbar-brand" href="#">Odonto Clinic soft Manager</a>

    
        <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-collapse-primary">
          <span class="sr-only">Toggle Side Navigation</span>
          <i class="icon-th-list"></i>
        </button>

        <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-collapse-top">
          <span class="sr-only">Toggle Top Navigation</span>
          <i class="icon-align-justify"></i>
        </button>
    
  </div>

  
      

      <!-- Collect the nav links, forms, and other content for toggling -->
      <div class="collapse navbar-collapse navbar-collapse-top">
        <div class="navbar-right">

          <ul class="nav navbar-nav navbar-left">
            <li class="cdrop active"><a href="#">Link</a></li>

            <li class="cdrop"><a href="#">Link</a></li>

            <li class="dropdown cdrop">
              <a href="#" class="dropdown-toggle" data-toggle="dropdown">Dropdown <b class="caret"></b></a>
              <ul class="dropdown-menu">
                <li><a href="#">Action</a></li>
                <li><a href="#">Another action</a></li>
                <li class="divider"></li>
                <li><a href="#">Separated link</a></li>
              </ul>
            </li>
          </ul>

          <form class="navbar-form navbar-left" role="search">
            <div class="form-group">
              <input type="text" class="search-query animated" placeholder="Search">
              <i class="icon-search"></i>
            </div>
          </form>

          <ul class="nav navbar-nav navbar-left">
            <li class="dropdown">
              <a href="#" class="dropdown-toggle dropdown-avatar" data-toggle="dropdown">
              <span>
                <img class="menu-avatar" src="../../images/avatars/OrthoDental.jpg" /> <span>Ortho Dental <i class="icon-caret-down"></i></span>
                <span class="badge badge-dark-red">5</span>
              </span>
              </a>
              <ul class="dropdown-menu">

                <!-- the first element is the one with the big avatar, add a with-image class to it -->

                <li class="with-image">
                  <div class="avatar">
                    <img src="../../images/avatars/OrthoDental.jpg" />
                  </div>
                  <span>Ortho Dental</span>
                </li>

                <li class="divider"></li>

                <li><a href="#"><i class="icon-user"></i> <span>Profile</span></a></li>
                <li><a href="#"><i class="icon-cog"></i> <span>Settings</span></a></li>
                <li><a href="#"><i class="icon-envelope"></i> <span>Messages</span> <span class="label label-dark-red pull-right">5</span></a></li>
                <li><a ng-click="paginaSigOut()" ><i class="icon-off"></i> <span>Logout</span></a></li>
              </ul>
            </li>
          </ul>
        </div>




      </div><!-- /.navbar-collapse -->

  
</nav>
<div class="sidebar-background">
  <div class="primary-sidebar-background"></div>
</div>

<div class="primary-sidebar">

  <!-- Main nav -->
  <ul class="nav navbar-collapse collapse navbar-collapse-primary">
    
    

        <li class="active">
          <span class="glow"></span>
          <a ng-click="seleccionarVista(0)">
              <i class="icon-dashboard icon-2x"></i>
              <span>Operaciones</span>
          </a>
        </li>
    
        <li class="">
          <span class="glow"></span>
          <a ng-click="seleccionarVista(1)">
              <i class="icon-user icon-2x"></i>
              <span>Pacientes</span>
          </a>
        </li>

        <li class="">
          <span class="glow"></span>
          <a >
              <i class="icon-calendar icon-2x"></i>
              <span>agenda detallada</span>
          </a>
        </li>

    	<li class="">
          <span class="glow"></span>
          <a >
              <i class="icon-bar-chart icon-2x"></i>
              <span>Reportes</span>
          </a>
        </li>
        
        <li class="">
          <span class="glow"></span>
          <a >
              <i class="icon-money icon-2x"></i>
              <span>Caja</span>
          </a>
        </li>
        <li class="">
          <span class="glow"></span>
          <a >
              <i class="icon-briefcase icon-2x"></i>
              <span>Administrar Clinica</span>
          </a>
        </li>
        <li class="">
          <span class="glow"></span>
          <a >
              <i class="icon-user-md icon-2x"></i>
              <span>Opcion en Desarrollo</span>
          </a>
        </li>


    

        <!-- <li class="dark-nav ">

          <span class="glow"></span>

          

          <a class="accordion-toggle collapsed " data-toggle="collapse" href="#WLGsdJPav9">
              <i class="icon-link icon-2x"></i>
                    <span>
                      Others
                      <i class="icon-caret-down"></i>
                    </span>

          </a>

          <ul id="WLGsdJPav9" class="collapse ">
            
                <li class="">
                  <a href="../other/wizard.html">
                      <i class="icon-magic"></i> Wizard
                  </a>
                </li>
            
                <li class="">
                  <a href="../other/login.html">
                      <i class="icon-user"></i> Login Page
                  </a>
                </li>
            
                <li class="">
                  <a href="../other/sign_up.html">
                      <i class="icon-user"></i> Sign Up Page
                  </a>
                </li>
            
                <li class="">
                  <a href="../other/full_calendar.html">
                      <i class="icon-calendar"></i> Full Calendar
                  </a>
                </li>
            
                <li class="">
                  <a href="../other/error404.html">
                      <i class="icon-ban-circle"></i> Error 404 page
                  </a>
                </li>
            
          </ul>

        </li> -->

    


  </ul>

  <div class="hidden-sm hidden-xs">
    <div class="text-center" style="margin-top: 60px">
      <div class="easy-pie-chart-percent" style="display: inline-block" data-percent="89"><span>89%</span></div>
      <div style="padding-top: 20px"><b>Cumplimiento de la meta</b></div>
    </div>

    <hr class="divider" style="margin-top: 60px">

    <div class="sparkline-box side">

      <div class="sparkline-row">
        <h4 class="gray"><span>Orders</span> 847</h4>
        <div class="sparkline big" data-color="gray"><!--16,7,23,13,12,11,15,4,19,18,4,24--></div>
      </div>

      <hr class="divider">
      <div class="sparkline-row">
        <h4 class="dark-green"><span>Income</span> $43.330</h4>
        <div class="sparkline big" data-color="darkGreen"><!--6,3,24,25,27,29,14,26,20,8,12,20--></div>
      </div>

      <hr class="divider">
      <div class="sparkline-row">
        <h4 class="blue"><span>Reviews</span> 223</h4>
        <div class="sparkline big" data-color="blue"><!--11,19,20,20,5,18,11,6,16,20,26,11--></div>
      </div>

      <hr class="divider">
    </div>
  </div>


</div>
<div ng-switch="vistaSeleccionada">
	<div ng-switch-when="vistaOperaciones" ng-init="traerinformacionTableroPrincipal()">
		<ng-include src="'/Recursos/html/TableroPrincipal.jsp'"></ng-include>
	</div>
	<div ng-switch-when="vistaPaciente" ng-init="inicilizarInformacionPaciente()">
		<ng-include src="'/Recursos/html/Paciente.jsp'"></ng-include>
	</div>
</div>
</body>
</html>
