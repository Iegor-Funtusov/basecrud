package ua.com.alevel.basecrud.service.impl;

import org.springframework.stereotype.Service;
import ua.com.alevel.basecrud.service.EncriptService;

import java.util.Base64;

/**
 * @author Iehor Funtusov, created 06/11/2020 - 8:34 PM
 */

@Service
public class EncriptServiceImpl implements EncriptService {

    @Override
    public String encript(String password) {
        return Base64.getEncoder().encodeToString(password.getBytes());
    }

    @Override
    public String decript(String encript) {
        return new String(Base64.getDecoder().decode(encript));
    }
}
