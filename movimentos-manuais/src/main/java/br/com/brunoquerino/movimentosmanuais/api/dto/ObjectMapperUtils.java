package br.com.brunoquerino.movimentosmanuais.api.dto;

import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;


public class ObjectMapperUtils {
    private static ModelMapper modelMapper;
    static {
        modelMapper = new ModelMapper();
        modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
    }
    public static <D, T> D map(final T entity, Class<D> outClass) {
        return modelMapper.map(entity, outClass);
    }
}
