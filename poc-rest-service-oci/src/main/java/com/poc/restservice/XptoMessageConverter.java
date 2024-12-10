package com.poc.restservice;

import org.springframework.http.HttpInputMessage;
import org.springframework.http.HttpOutputMessage;
import org.springframework.http.MediaType;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.stereotype.Component;
import java.io.IOException;
import java.util.List;

@Component
public class XptoMessageConverter implements HttpMessageConverter<Object> {

    @Override
    public boolean canRead(Class<?> clazz, MediaType mediaType) {
        return mediaType.isCompatibleWith(MediaType.valueOf("application/xpto.com"));
    }

    @Override
    public boolean canWrite(Class<?> clazz, MediaType mediaType) {
        return mediaType.isCompatibleWith(MediaType.valueOf("application/xpto.com"));
    }

    @Override
    public Object read(Class<? extends Object> clazz, HttpInputMessage inputMessage) throws IOException {
        // Lógica para ler e converter o conteúdo de entrada
        return null; // Retorne o objeto convertido
    }

    @Override
    public void write(Object object, MediaType contentType, HttpOutputMessage outputMessage) throws IOException {
        // Lógica para escrever o conteúdo de saída
    }

    @Override
    public List<MediaType> getSupportedMediaTypes() {
        return List.of(MediaType.valueOf("application/xpto.com"));
    }
}
