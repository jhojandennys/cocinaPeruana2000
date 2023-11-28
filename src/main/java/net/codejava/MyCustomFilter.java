package net.codejava;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

import org.springframework.security.web.util.matcher.AntPathRequestMatcher;



public class MyCustomFilter extends UsernamePasswordAuthenticationFilter {

    public MyCustomFilter() {
        super();
        setRequiresAuthenticationRequestMatcher(new AntPathRequestMatcher("/home", "GET")); // Cambia "/panel" por la URL a la que deseas redirigir
    }

}