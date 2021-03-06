package springboot.security.config.auth;

//login->security session(Security ContextHolder)
//object => Authentication type
//User info in Authentication
//User Object type => UserDetails type
//Security Session => Authentication => UserDetails

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import springboot.security.model.User;

import java.util.ArrayList;
import java.util.Collection;

public class PrincipalDetails implements UserDetails {

    private User user; // composition

    public PrincipalDetails(User user){
        this.user = user;
    }

    //해당 User의 권한을 리턴하는 곳
    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        Collection<GrantedAuthority> collect = new ArrayList<>();
        collect.add(new GrantedAuthority() {
            @Override
            public String getAuthority() {
                return user.getRole();//string type
            }
        });
        return collect;
    }

    @Override
    public String getPassword() {
        return user.getPassword();
    }

    @Override
    public String getUsername() {
        return user.getUsername();
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        //1년 이상 휴면 계정
        //model-User -> private Timestamp loginDate;
        //user.getLoginDate(); - 현재시간-로그인시간 => 1년 초과 => return false;
        return true;
    }
}
