
app.controller("pacienteCtrl",function ($scope , $http , $location) {
	
	$scope.pacientes='';
	$scope.clinicaFiltrada={lista:''};
	$scope.nombreCompletoPaciente=function (paciente){
		var nombreCompleto='';
		if(paciente != null && paciente.datosBasicos != null){
			if(paciente.datosBasicos.dsPrimerNombre != null){
				nombreCompleto = nombreCompleto +paciente.datosBasicos.dsPrimerNombre;
			}
			if(paciente.datosBasicos.dsSegundoNombre != null){
				nombreCompleto = nombreCompleto +" "+paciente.datosBasicos.dsSegundoNombre;
			}
			if(paciente.datosBasicos.dsPrimerApellido != null){
				nombreCompleto = nombreCompleto +" "+paciente.datosBasicos.dsPrimerApellido;
			}
			if(paciente.datosBasicos.dsSegundoApellido != null){
				nombreCompleto = nombreCompleto +" "+paciente.datosBasicos.dsSegundoApellido;
			}
		}
		return nombreCompleto;
	}
});