package cn.qtech;

import cn.qtech.domain.User;
import org.springframework.security.core.context.SecurityContext;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;

/**
 * @author wangruyu
 * @since 2017/3/15-09:58
 */
public class LoginUtil {
    public static User getLoginUser() {
        SecurityContext context = SecurityContextHolder.getContext();
        if (context == null) {
            return null;
        }

        if (context.getAuthentication().getPrincipal() instanceof UserDetails) {
            return (User) context.getAuthentication().getPrincipal();
        }
        return null;
    }
}
