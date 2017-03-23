package cn.qtech.security;

import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.stereotype.Component;

/**
 * @author wangruyu
 * @since 2017/3/14-18:11
 */
@Component
public class SecurityConfig extends WebSecurityConfigurerAdapter {
    @Override
    protected void configure(HttpSecurity http) throws Exception {
        LoginSuccessHandler loginSuccessHandler = new LoginSuccessHandler();
        LoginFailedHandler loginFailedHandler = new LoginFailedHandler();
        http.authorizeRequests()
                .antMatchers("/css/**", "/js/**", "/controllers/**", "/metrontic/**","/img/**", "/index.html", "/*.js").permitAll()
                .anyRequest().authenticated()
                .and()
                .formLogin()
                .loginPage("/login").permitAll()
                .usernameParameter("username")
                .passwordParameter("password")
                .successHandler(loginSuccessHandler)
                .failureHandler(loginFailedHandler)
                .and().logout().permitAll()
                .and().csrf().disable()
        ;

    }

}
