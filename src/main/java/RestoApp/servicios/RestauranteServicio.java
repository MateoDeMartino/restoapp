//
//package RestoApp.servicios;
//
//import RestoApp.Entidades.Restaurante;
//import RestoApp.Entidades.Zona;
//import RestoApp.Errores.ErrorServicio;
//import RestoApp.repositorios.RestauranteRepositorio;
//import java.util.List;
//import java.util.Optional;
//import javax.transaction.Transactional;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//@Service
//public class RestauranteServicio {
//    
//    @Autowired
//    private RestauranteRepositorio restauranteRepositorio;
//    
//    @Transactional
//    public void guardarRestaurante(String nombre, Menu menu,Integer mesas,Zona zona,Boolean abierto)throws ErrorServicio{
//        
//        Restaurante restaurante = new Restaurante();
//        
//        if (nombre == null || nombre.isEmpty()) {
//            throw new ErrorServicio("El nombre no puede ser nulo");
//        }
//        if (menu == null || menu.isEmpty()) {
//            throw new ErrorServicio("Se necesita un menu");
//        }
//        if (mesas == null || mesas == 0) {
//            throw new ErrorServicio("Se necesita la cantidad de mesas");
//        }
//        if (zona == null) {
//            throw new ErrorServicio("Se necesita saber la zona");
//        }
//        if (abierto == null ) {
//            throw new ErrorServicio("Se necesita saber si esta abierto o cerrado");
//        }
//        
//        
//        restaurante.setNombre(nombre);
//        restaurante.setMenu(menu);
//        restaurante.setMesas(mesas);
//        restaurante.setZona(zona);
//        restaurante.setAbierto(abierto);
//        
//        restauranteRepositorio.save(restaurante);
//        
//    }
//    
//    @Transactional
//    public Restaurante buscarRestaurante(String nombre){
//        
//       Restaurante restaurante = restauranteRepositorio.buscarRestaurantePorNombre(nombre);
//       
//       return restaurante;
//        
//    }
//    
//    @Transactional
//    public void modificarRestaurante(String nombre) {
//
//        Restaurante restaurante = restauranteRepositorio.buscarRestaurantePorNombre(nombre);
//        //restaurante.setNombre();
//        restauranteRepositorio.save(restaurante);
//
//    }
//    
//    @Transactional
//    public void eliminarRestaurante(String Id){
//        
//        Optional<Restaurante> restaurante = restauranteRepositorio.findById(Id);
//        restaurante.get().setAbierto(false);
//        restauranteRepositorio.save(restaurante.get());
//        
//    }
//    
//    @Transactional
//    public List<Restaurante> listaraRestaurantes() {
//        
//        return restauranteRepositorio.findAll();
//    
//    }
//}
