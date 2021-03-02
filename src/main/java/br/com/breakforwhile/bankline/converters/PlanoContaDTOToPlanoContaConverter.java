package br.com.breakforwhile.bankline.converters;

import br.com.breakforwhile.bankline.models.DTO.PlanoContaDTO;
import br.com.breakforwhile.bankline.models.PlanoConta;
import org.springframework.core.convert.converter.Converter;


public class PlanoContaDTOToPlanoContaConverter implements Converter<PlanoContaDTO, PlanoConta> {


    @Override
    public PlanoConta convert(PlanoContaDTO planoContaDTO) {
        return null;
    }

    @Override
    public <U> Converter<PlanoContaDTO, U> andThen(Converter<? super PlanoConta, ? extends U> after) {
        return null;
    }
}
