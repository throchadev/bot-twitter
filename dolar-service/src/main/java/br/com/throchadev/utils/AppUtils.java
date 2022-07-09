package br.com.throchadev.utils;

import br.com.throchadev.dto.DolarDto;
import br.com.throchadev.objects.Dolar;
import org.springframework.beans.BeanUtils;

public class AppUtils {

    public static DolarDto entityToDto(Dolar dolar) {
        DolarDto dolarDto = new DolarDto();
        BeanUtils.copyProperties(dolar, dolarDto);
        return dolarDto;
    }
}
