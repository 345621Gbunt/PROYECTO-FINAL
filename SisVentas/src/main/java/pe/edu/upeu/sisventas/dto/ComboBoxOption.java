package pe.edu.upeu.sisventas.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ComboBoxOption {
    String key;
    String value;

    @Override
    public String toString() {
        return value;
    }
}
