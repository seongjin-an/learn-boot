package hello.container;

import jakarta.servlet.ServletContext;

public interface AppInit {
    void onStartup(ServletContext servletContext); // servlet 컨테이너(필터, 서블릿 등록 가능)
}
