package pe.edu.upeu.sisventas.model;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import pe.edu.upeu.sisventas.enums.TipoDocumentos;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Cliente {
    private String dniruc;
    private String nombres;
    private TipoDocumentos tipoDocumento;
    private String repLegal;
    private String direccion;
}
