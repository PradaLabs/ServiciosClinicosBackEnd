package co.com.pradalabs.odontoclinicbackend.persistencia.adapter;

import java.util.Map;

import javax.jdo.PersistenceManager;

import co.com.pradalabs.odontoclinicbackend.persistencia.PMF;
import co.com.pradalabs.odontoclinicbackend.persistencia.Interface.IActulizarPM;
import co.com.pradalabs.odontoclinicbackend.utils.BussinessException;

public abstract class EjecutorActualizarAdapter implements IActulizarPM{
	
	private PersistenceManager pm=null;
	
	@Override
	public Object consultarObjeto(Map<String, Object> datoIngresados)throws BussinessException {
		
		try{
			pm = PMF.get().getPersistenceManager();
			Object ObjetoActualizar=prepararActualizarDatos();
			ObjetoActualizar=pm.getObjectById(ObjetoActualizar.getClass(),claveBuquedaParaActualizar( datoIngresados) );
			if(!pm.isClosed())
				pm.close();
			return ObjetoActualizar;
		}catch(Exception e){
			BussinessException bussinessException=new BussinessException("problema obtener los parametros para actualizar en BD",e.getCause() ,this.getClass().getName(),"");
			throw bussinessException;
		}finally{
			
		}
		
	}
	@Override
	public Object ActualizarObjeto(Map<String,Object> datoIngresados)throws BussinessException{
		try{
			pm = PMF.get().getPersistenceManager();
			Object ObjetoActualizar=prepararActualizarDatos();
			ObjetoActualizar=pm.getObjectById(ObjetoActualizar.getClass(),claveBuquedaParaActualizar( datoIngresados) );
			return ObjetoActualizar;
		}catch(Exception e){
			BussinessException bussinessException=new BussinessException("problema obtener los parametros para actualizar en BD",e.getCause() ,this.getClass().getName(),"");
			throw bussinessException;
		}finally{
			
		}
	}
	@Override
	public Boolean cerrarConexion()throws BussinessException{
		boolean resultado = false;
		try{
			if(pm != null && !pm.isClosed()){
				pm.close();
				resultado=true;
			}
		}
		catch (Exception e) {
			BussinessException bussinessException=new BussinessException("problema al guardar esl objeto en la BD",e.getCause() ,this.getClass().getName(),"");
			throw bussinessException;
		}
		return resultado;
	}
	
	public abstract Object prepararActualizarDatos() throws BussinessException;
	public abstract Object claveBuquedaParaActualizar(Map<String, Object> datoIngresados) throws BussinessException;
}
