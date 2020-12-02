
import controllers.CitaController;
import controllers.DoctorController;
import controllers.ExpedienteController;
import controllers.UsuarioController;
import models.Cita;
import models.Doctor;
import models.Expediente;
import models.Usuario;
import org.springframework.web.bind.annotation.RestController;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author P
 */
@RestController
public class ExpedientesMedicos implements ExpedientesMedicosAPI {

    private ExpedienteController expedientesApi;
    private DoctorController doctoresApi;
    private UsuarioController usuariosApi;
    private CitaController citasApi;

    /**
     *
     */
    public ExpedientesMedicos() {
        expedientesApi = new ExpedienteController();
        doctoresApi = new DoctorController();
        usuariosApi = new UsuarioController();
        citasApi = new CitaController();
    }

    @Override
    public boolean registrarExpediente(Expediente expediente) {
        boolean result = expedientesApi.registrarExpediente(expediente);
        return result;
    }

    @Override
    public Expediente consultarExpediente(String curp) {
        Expediente result = expedientesApi.consultarExpediente(curp);
        return result;
    }

    @Override
    public Expediente registrarEntradaHistorial(String curp, String entrada) {
        Expediente result = expedientesApi.registrarEntradaHistorial(curp, entrada);
        return result;
    }


    @Override
    public boolean registraDoctor(Doctor doctor) {
        boolean result = doctoresApi.registrarDoctor(doctor);
        return result;
    }

    @Override
    public Doctor consultaDoctor(String cedula) {
        Doctor result = doctoresApi.consultarDoctor(cedula);
        return result;
    }

    @Override
    public boolean registrarUsuario(Usuario user) {
        boolean result = usuariosApi.registrarUsuario(user);
        return result;
    }
    
    @Override
    public Usuario identificarse(String user, String pass) {
        Usuario result = usuariosApi.identificarUsuario(user, pass);
        return result;
    }
    
    @Override
    public Cita registrarCita(Cita cita) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Cita[] consultaCitas(String curp) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
