package sv.edu.uesocc.ingenieria.prn335_2017.web.client.service;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import sv.edu.uesocc.ingenieria.prn335_2017.web.client.service.Seccion;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-11-23T22:50:43")
@StaticMetamodel(TipoSeccion.class)
public class TipoSeccion_ { 

    public static volatile SingularAttribute<TipoSeccion, String> descripcion;
    public static volatile SingularAttribute<TipoSeccion, Integer> idTipoSeccion;
    public static volatile SingularAttribute<TipoSeccion, String> nombre;
    public static volatile SingularAttribute<TipoSeccion, Boolean> activo;
    public static volatile ListAttribute<TipoSeccion, Seccion> seccionList;

}