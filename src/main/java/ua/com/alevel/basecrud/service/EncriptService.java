package ua.com.alevel.basecrud.service;

/**
 * @author Iehor Funtusov, created 06/11/2020 - 8:33 PM
 */

public interface EncriptService {

    String encript(String password);
    String decript(String encript);
}
