//package com.lms.config;
//
//
//import org.springframework.beans.factory.annotation.Autowired;
//
//import org.springframework.context.annotation.Configuration;
//import org.springframework.core.annotation.Order;
//import org.springframework.http.HttpMethod;
//import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
//import org.springframework.security.config.http.SessionCreationPolicy;
//import org.springframework.security.crypto.password.NoOpPasswordEncoder;
//import org.springframework.security.crypto.password.PasswordEncoder;
//import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;
//
//import com.lms.serviceimpl.CustomStudentDetailsService;
//
//
//@Configuration
//@EnableWebSecurity
//@Order(1000)
//public class MyStudentSecurityConfig extends WebSecurityConfigurerAdapter {
//
//
//    @Autowired
//    private CustomStudentDetailsService customStudentDetailsService;
//
//    @Autowired
//    private JwtAuthenticationFilter jwtFilter;
//
//    @Autowired
//    private JwtAuthenticationEntryPoint entryPoint;
//
//    @Override
//    protected void configure(HttpSecurity http) throws Exception {
//        http
//                .csrf()
//                .disable()
////                .cors()
////                .disable()
//                //.allowedOrigins("http://http://localhost:3000")
//                .authorizeRequests()
//                .antMatchers("/token","/avi/Delete","/avi/login").permitAll()
//                .antMatchers(HttpMethod.OPTIONS).permitAll()
//                .anyRequest().authenticated()
//                .and()
//                .sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS)
//                .and()
//                .exceptionHandling().authenticationEntryPoint(entryPoint);
//
//        http.addFilterBefore(jwtFilter, UsernamePasswordAuthenticationFilter.class);
//
//    }
//
//    //over
//    @Override
//    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
//        auth.userDetailsService(customStudentDetailsService);
//    }
//
////    @Bean
////    public PasswordEncoder passwordEncoder() {
////        return NoOpPasswordEncoder.getInstance();
////    }
//
////    @Bean
////    public AuthenticationManager authenticationManagerBean() throws Exception {
////        return super.authenticationManagerBean();
////    }
//
//
//
//}
