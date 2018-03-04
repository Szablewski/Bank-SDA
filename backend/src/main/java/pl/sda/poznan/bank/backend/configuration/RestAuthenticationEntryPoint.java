package pl.sda.poznan.bank.backend.configuration;

import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.AuthenticationEntryPoint;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
@Component
public class RestAuthenticationEntryPoint implements AuthenticationEntryPoint {

    @Override
    public void commence(final HttpServletRequest httpServletRequest, final HttpServletResponse httpServletResponse, final AuthenticationException authException) throws IOException {
        httpServletResponse.setStatus(401);

    }
}
