package co.com.pradalabs.odontoclinicbackend.rest;



import java.util.ArrayList;
import java.util.List;

import javax.jdo.PersistenceManager;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import co.com.pradalabs.odontoclinicbackend.modelo.clinica.Clinica;
import co.com.pradalabs.odontoclinicbackend.modelo.clinica.Horario;
import co.com.pradalabs.odontoclinicbackend.modelo.clinica.Paciente;
import co.com.pradalabs.odontoclinicbackend.persistencia.PMF;
import co.com.pradalabs.odontoclinicbackend.servicios.ServicioGuardarClinica;

import com.google.appengine.api.datastore.Key;
import com.google.appengine.api.datastore.KeyFactory;


@Path("/OdontoClinic")
public class OdontoClinicResource {

	@GET
	  @Path("/guardarCLinica")
	  public Response getMessage(@PathParam("name") String name)
	  {
		String outMsg=null;	
		PersistenceManager pm = PMF.get().getPersistenceManager();
		try
		{
			String email= "orthodental@gmail.com";	
			Clinica clinica = new Clinica();
			clinica.setCdClinica(1);
			clinica.setDsClinica(email);
			Key keyClinica=KeyFactory.createKey(Clinica.class.getSimpleName(),email);
			Key keyHorario=KeyFactory.createKey(keyClinica, Horario.class.getSimpleName(), email);
			Horario horario = new Horario();
			horario.setCdClinica(1);
			horario.setDsHorarioHabil("H8");
			horario.setKey(keyHorario);
			List<Paciente> listaPaciente = new ArrayList<>();
			Paciente paciente1=new Paciente();
			Paciente paciente2=new Paciente();
			Paciente paciente3=new Paciente();
			
			Key keyPaciente1 =KeyFactory.createKey(keyClinica, Paciente.class.getSimpleName(),"C94542961");
			Key keyPaciente2 =KeyFactory.createKey(keyClinica, Paciente.class.getSimpleName(),"C94542962");
			Key keyPaciente3 =KeyFactory.createKey(keyClinica, Paciente.class.getSimpleName(),"C94542963");
			paciente1.setDNI("C94542961");
			paciente2.setDNI("C94542962");
			paciente2.setDNI("C94542963");
			paciente1.setKey(keyPaciente1);
			paciente2.setKey(keyPaciente2);
			paciente3.setKey(keyPaciente3);
			listaPaciente.add(paciente1);
			listaPaciente.add(paciente2);
			listaPaciente.add(paciente3);
			clinica.setPacientes(listaPaciente);
			clinica.setDsHorario(horario);
			clinica.setKey(keyClinica);
			ServicioGuardarClinica servicioGuardarClinica = new ServicioGuardarClinica();
			boolean respuesta=servicioGuardarClinica.GuardarClinica(clinica,"orthodental@gmail.com.co");
			if(respuesta){
				Horario horarioRecuperado = pm.getObjectById(Horario.class, keyHorario);
				List<Paciente> listaPacienteRecuperada = new ArrayList<>();
				Paciente pacienteRecuperado1 = pm.getObjectById(Paciente.class, keyPaciente1);
				System.out.println(horarioRecuperado.toString());
				if(pacienteRecuperado1 != null && pacienteRecuperado1.getDNI() != null)
				System.out.println("Cedula de Paciente Recuperado: "+pacienteRecuperado1.getDNI());
				 outMsg = "Se guardo con exito la clinica  " + name +"!";
			}else{
				outMsg = "No se logro guardar la clinica viejo  " + name + "!";
			}
	  
		}catch(Exception e){
			e.printStackTrace();
			 outMsg = "No se logro guardar la clinica viejo  " + name + "!";
			 return Response.status(200).entity(outMsg).build();
		}
		  return Response.status(200).entity(outMsg).build();
	  }
	
	
	@POST
	@Path("/post")
	@Consumes(MediaType.APPLICATION_JSON)
    public String AutenticacionGoogle(String inputJsonObj)  {
		System.out.println("pasa por aqui "+this.getClass().getName());
        return "Hola Mundo";
    }
}
