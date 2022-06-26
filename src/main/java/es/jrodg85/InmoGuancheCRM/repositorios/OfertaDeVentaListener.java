package es.jrodg85.InmoGuancheCRM.repositorios;

import javax.persistence.PrePersist;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;
import org.springframework.web.server.ResponseStatusException;
import es.jrodg85.InmoGuancheCRM.entidades.OfertaConId;
import es.jrodg85.InmoGuancheCRM.entidades.OfertaDeVentaConId;

@Component
public class OfertaDeVentaListener {

  private Logger logger = LoggerFactory.getLogger(OfertaConId.class);


  // no hago uso de los campos dao ni por tanto del autowired,
  // por lo que de momento lo comento

  // private OfertaDeAlquilerDAO ofertaDeAlquilerDAO;
  // private OfertaDeVentaDAO ofertaDeVentaDAO;

  //
  // @Autowired
  // public void init(OfertaDeAlquilerDAO ofertaDeAlquilerDAO, OfertaDeVentaDAO ofertaDeVentaDAO) {
  // this.ofertaDeAlquilerDAO = ofertaDeAlquilerDAO;
  // this.ofertaDeVentaDAO = ofertaDeVentaDAO;
  // }


  @PrePersist
  public void prePutOfertaDeVenta(OfertaDeVentaConId ofertaDeVentaConId) throws Exception {
    if (ofertaDeVentaConId.getPrecioDeVenta() <= 0) {
      logger.warn("Se ha intentado crear una oferta de VENTA cuyo precio es menor o igual a 0.");
      throw new ResponseStatusException(HttpStatus.BAD_REQUEST,
          " El precio de VENTA debe de ser mayor que 0 ");
    }

  }
}
